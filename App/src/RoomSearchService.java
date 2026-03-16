/**
 * this class provide functions to view available rooms
 *
 * @version 4.0
 */

import java.util.Map;

public class RoomSearchService {

    public void searchAvailableRooms(RoomInventory inventory, SingleRoom singleRoom, DoubleRoom doubleRoom, SuiteRoom suiteRoom){
        Map<String,Integer>availability=inventory.getRoomAvailability();

        if (availability.get("Single Room")>0){
            singleRoom.displayRoom();
            System.out.println("Available Single room :"+availability.get("Single Room"));
        }
        if (availability.get("Double Room")>0){
            doubleRoom.displayRoom();
            System.out.println("Available Double room :"+availability.get("Double Room"));
        }
        if (availability.get("Suite Room")>0){
            suiteRoom.displayRoom();
            System.out.println("Available Suite room :"+availability.get("Suite Room"));
        }
    }
}
