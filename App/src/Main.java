/**
 * ================================================================
 * CLASS - Main
 * ================================================================
 *
 * Description:
 * Demonstrates Add-On Service Selection functionality.
 *
 * @author anjan
 * @version 7.0
 */
public class Main {

    public static void main(String[] args) {

        AddOnServiceManager manager = new AddOnServiceManager();

        // Create services
        AddOnService breakfast = new AddOnService("Breakfast", 500);
        AddOnService spa = new AddOnService("Spa", 700);
        AddOnService pickup = new AddOnService("Airport Pickup", 300);

        String reservationId = "Single-1";

        // Add services to reservation
        manager.addService(reservationId, breakfast);
        manager.addService(reservationId, spa);
        manager.addService(reservationId, pickup);

        // Calculate total cost
        double totalCost = manager.calculateTotalServiceCost(reservationId);

        // Output
        System.out.println("Add-On Service Selection");
        System.out.println("Reservation ID: " + reservationId);
        System.out.println("Total Add-On Cost: " + totalCost);
    }
}