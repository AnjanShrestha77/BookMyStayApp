import java.util.*;

/**
 * Handles room allocation logic.
 */
public class RoomAllocationService {

    private Map<String, Integer> roomCounters = new HashMap<>();

    public RoomAllocationService() {
        roomCounters.put("Single Room", 0);
        roomCounters.put("Double Room", 0);
        roomCounters.put("Suite Room", 0);
    }

    public Reservation allocateRoom(BookingRequest request, RoomInventory inventory) {

        String type = request.getRoomType();

        if (inventory.getAvailableRooms(type) <= 0) {
            return null;
        }

        // Decrement inventory
        inventory.decrementRoom(type);

        // Generate room ID
        int count = roomCounters.get(type) + 1;
        roomCounters.put(type, count);

        String prefix = type.split(" ")[0]; // Single, Double, Suite
        String roomId = prefix + "-" + count;

        return new Reservation(request.getGuestName(), roomId);
    }
}