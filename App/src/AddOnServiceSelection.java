/**
 * ==================================
 * Main class - AddOnServiceSelection
 *===================================
 *
 * this class demonstrate optional services can be attached to a confirmed booking
 *
 *
 * services are added after room allocation do not affect the inventory
 *
 * @author Anjan
 * @version 7.0
 */


public class AddOnServiceSelection {
    public static void main(){
        AddOnServiceManager manager=new AddOnServiceManager();
        String reservationId="Single-1";
        AddOnService AirpotPickup=new AddOnService("Airport pickup",1000);
        AddOnService Spa=new AddOnService("Spa",10000);

        System.out.println("Add-On Service Selection: ");
        manager.addService(reservationId,AirpotPickup);
        manager.addService(reservationId,Spa);
        System.out.println("Reservation Id: "+ reservationId);
        System.out.println("Total Add-On Cost: "+ manager.calculateTotalServiceCost(reservationId) );

    }
}
