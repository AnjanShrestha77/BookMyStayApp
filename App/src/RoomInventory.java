import java.util.HashMap;
import java.util.Map;

/**
 * ================================================================
 * CLASS - RoomInventory
 * ================================================================
 *
 * Description:
 * This class acts as the single source of truth
 * for room availability in the hotel.
 *
 * It supports thread-safe operations for:
 * - Room allocation (decrement)
 * - Inventory restoration (increment)
 *
 * Used in concurrent booking simulation.
 *
 * @version 12.0
 */
public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    /**
     * Initializes inventory with default values.
     */
    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    /**
     * Sets initial room counts.
     */
    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    /**
     * Gets available rooms for a given type.
     */
    public int getAvailableRooms(String roomType) {
        return roomAvailability.getOrDefault(roomType, 0);
    }

    /**
     * Decreases room count (booking).
     * Must be called inside synchronized block.
     */
    public void decrementRoom(String roomType) {
        int current = roomAvailability.getOrDefault(roomType, 0);
        if (current > 0) {
            roomAvailability.put(roomType, current - 1);
        }
    }

    /**
     * Increases room count (cancellation).
     */
    public void incrementRoom(String roomType) {
        int current = roomAvailability.getOrDefault(roomType, 0);
        roomAvailability.put(roomType, current + 1);
    }

    /**
     * Returns full inventory (for debugging/display).
     */
    public Map<String, Integer> getAllInventory() {
        return roomAvailability;
    }
    public void updateAvailability(String room, int count) {
        roomAvailability.put(room, count);
    }
}
