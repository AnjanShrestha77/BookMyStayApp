/**
 * ================================================================
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 * ================================================================
 *
 * Use Case 12: Data Persistence & System Recovery
 *
 * Description:
 * Demonstrates how system state
 * can be restored after an application restart.
 *
 * Inventory data is loaded from a file
 * before any booking operations occur.
 *
 * @version 12.0
 */
public class UseCase12DataPersistenceRecovery {

    /**
     * Application entry point.
     */
    public static void main(String[] args) {

        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();

        String filePath = "inventory.txt";

        // Load inventory from file
        persistenceService.loadInventory(inventory, filePath);

        // Display current inventory
        System.out.println("\nCurrent Inventory:");
        System.out.println("Single: " + inventory.getAvailableRooms("Single Room"));
        System.out.println("Double: " + inventory.getAvailableRooms("Double Room"));
        System.out.println("Suite: " + inventory.getAvailableRooms("Suite Room"));

        // Save inventory back to file
        persistenceService.saveInventory(inventory, filePath);
    }
}