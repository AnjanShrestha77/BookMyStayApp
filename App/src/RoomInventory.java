/**
 *
 *
 * this class acts as the single source of truth for room availability in the hotel
 *
 */

import java.util.HashMap;
import java.util.Map;

public class RoomInventory {
  private Map<String , Integer> roomAvailability;

  public RoomInventory(){
      roomAvailability=new HashMap<>();
      initializeInventory();


  }
  private void initializeInventory(){
      roomAvailability.put("Single Room",5);
      roomAvailability.put("Double Room",3);
      roomAvailability.put("Suite Room",2);
  }

  public Map<String,Integer> getRoomAvailability(){
      return roomAvailability;
  }
  public void updateAvailabilty(String room , int count){
      roomAvailability.put(room,count);
  }

}
