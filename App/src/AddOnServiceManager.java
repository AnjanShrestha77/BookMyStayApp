/**
 * ======================================
 * AddOnServiceManager
 * ======================================
 *
 * this class manages the optional services of the confirmed booked client
 *
 * it supports attaching  a list of add on services to a single reservation Id
 *
 * @version 7.0
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddOnServiceManager {
    private Map<String, List<AddOnService>> serviceByReservation;

    public  AddOnServiceManager(){
        serviceByReservation=new HashMap<>();
    }

    public void addService(String reservationId, AddOnService service){
        serviceByReservation.putIfAbsent(reservationId,new ArrayList<>());
        serviceByReservation.get(reservationId).add(service);



    }

    public double calculateTotalServiceCost(String reservationId){
        double total=0;
        if(serviceByReservation.containsKey(reservationId)){
            for(AddOnService service:serviceByReservation.get(reservationId)){
                total+=service.getCost();
            }
        }
        return total;
    }
}
