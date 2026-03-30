/**
 * ================================================================
 * MAIN CLASS - UseCase10BookingCancellation
 * ================================================================
 *
 * Use Case 10: Booking Cancellation & Inventory Rollback
 *
 * Description:
 * Demonstrates safe cancellation of bookings.
 *
 * Inventory is restored and rollback history is maintained.
 *
 * @version 10.0
 */
public class UseCase10BookingCancellation {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        CancellationService service = new CancellationService();
        RoomInventory inventory = new RoomInventory();

        // Initial inventory
        inventory.addRoom("Single", 5);

        // Register booking
        service.registerBooking("Single-1", "Single");

        System.out.println("Booking Cancellation");

        // Cancel booking
        service.cancelBooking("Single-1", inventory);

        // Show rollback history
        service.showRollbackHistory();

        // Show updated inventory
        System.out.println("\nUpdated Single Room Availability: " +
                inventory.getAvailableRooms("Single"));
    }
}