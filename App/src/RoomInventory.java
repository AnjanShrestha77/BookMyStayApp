import java.util.*;

/**
 * ================================================================
 * CLASS - RoomInventory
 * ================================================================
 *
 * Description:
 * Maintains room availability counts.
 *
 * @version 10.0
 */
public class RoomInventory {

    private Map<String, Integer> inventory;

    public RoomInventory() {
        inventory = new HashMap<>();
    }

    /**
     * Adds initial room count.
     */
    public void addRoom(String roomType, int count) {
        inventory.put(roomType, count);
    }

    /**
     * Increments room count after cancellation.
     */
    public void incrementRoom(String roomType) {
        inventory.put(roomType, inventory.getOrDefault(roomType, 0) + 1);
    }

    /**
     * Gets available room count.
     */
    public int getAvailableRooms(String roomType) {
        return inventory.getOrDefault(roomType, 0);
    }
}