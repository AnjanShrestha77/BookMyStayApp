/**
 * ================================================================
 * MAIN CLASS - UseCase11ConcurrentBookingSimulation
 * ================================================================
 *
 * Simulates multiple users booking concurrently.
 *
 * @version 11.0
 */
public class UseCase11ConcurrentBookingSimulation {

    public static void main(String[] args) {

        System.out.println("Concurrent Booking Simulation");

        RoomInventory inventory = new RoomInventory();
        BookingRequestQueue queue = new BookingRequestQueue();
        RoomAllocationService allocationService = new RoomAllocationService();

        // Add booking requests
        queue.addRequest(new BookingRequest("Abhi", "Single Room"));
        queue.addRequest(new BookingRequest("Vanmathi", "Double Room"));
        queue.addRequest(new BookingRequest("Kunal", "Suite Room"));
        queue.addRequest(new BookingRequest("Subha", "Single Room"));

        // Create threads
        Thread t1 = new Thread(
                new ConcurrentBookingProcessor(queue, inventory, allocationService)
        );

        Thread t2 = new Thread(
                new ConcurrentBookingProcessor(queue, inventory, allocationService)
        );

        // Start threads
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread execution interrupted.");
        }

        // Show remaining inventory
        System.out.println("\nRemaining Inventory:");
        System.out.println("Single: " + inventory.getAvailableRooms("Single Room"));
        System.out.println("Double: " + inventory.getAvailableRooms("Double Room"));
        System.out.println("Suite: " + inventory.getAvailableRooms("Suite Room"));
    }
}