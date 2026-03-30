/**
 * ================================================================
 * CLASS - ConcurrentBookingProcessor
 * ================================================================
 *
 * Use Case 11: Concurrent Booking Simulation
 *
 * Demonstrates thread-safe booking processing.
 *
 * @version 11.0
 */
public class ConcurrentBookingProcessor implements Runnable {

    /** Shared booking request queue. */
    private BookingRequestQueue bookingQueue;

    /** Shared room inventory. */
    private RoomInventory inventory;

    /** Shared allocation service. */
    private RoomAllocationService allocationService;

    public ConcurrentBookingProcessor(
            BookingRequestQueue bookingQueue,
            RoomInventory inventory,
            RoomAllocationService allocationService) {

        this.bookingQueue = bookingQueue;
        this.inventory = inventory;
        this.allocationService = allocationService;
    }

    @Override
    public void run() {

        while (true) {

            BookingRequest request;

            // 🔒 Synchronize queue access
            synchronized (bookingQueue) {
                if (bookingQueue.isEmpty()) {
                    break;
                }
                request = bookingQueue.getRequest();
            }

            Reservation reservation;

            // 🔒 Synchronize inventory (critical section)
            synchronized (inventory) {
                reservation = allocationService.allocateRoom(request, inventory);
            }

            if (reservation != null) {
                System.out.println("Booking confirmed for Guest: "
                        + reservation.getGuestName()
                        + ", Room ID: "
                        + reservation.getRoomId());
            }
        }
    }
}