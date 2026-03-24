/**
 * ======================================
 * Main class: UseCase9ErrorHandlingValidator
 * ==========================================
 *
 * this class demonstrate how user input is validate before booking is proceed
 *
 * @author anjan
 * @version 9.0
 */

import java.util.Scanner;

public class UseCase9ErrorHandlingValidator {

    public static void  main(String[] args){
        System.out.println("Booking Validation: ");
        Scanner scanner=new Scanner(System.in);

        RoomInventory inventory=new RoomInventory();
        ReservationValidator validator=new ReservationValidator();
        BookingRequestQueue bookingQueue=new BookingRequestQueue();

        try {
            // Input
            System.out.print("Enter Guest Name: ");
            String guestName = scanner.nextLine();

            System.out.print("Enter Room Type (Single Room / Double Room / Suite Room): ");
            String roomType = scanner.nextLine();

            // Validate
            validator.validate(guestName, roomType, inventory);

            // Create reservation
            Reservation reservation = new Reservation(guestName, roomType);

            // Add to queue
            bookingQueue.addRequest(reservation);

            System.out.println("Booking added successfully!");

            // Process next booking
            if (bookingQueue.hasPendingRequests()) {
                Reservation next = bookingQueue.getNextRequest();

                System.out.println("Processing booking for: " + next.getGuestName());

                // Reduce room count
                int current = inventory.getRoomAvailability().get(next.getRoomType());
                inventory.updateAvailabilty(next.getRoomType(), current - 1);
            }

        } catch (InvalidBookingException e) {
            System.out.println("Validation Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } finally {
            scanner.close();

        }
    }

}
