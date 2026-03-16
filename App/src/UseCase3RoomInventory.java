/**
 * main class
 *
 * use case 3 - room initialization
 * description : this class demonstrate the room initialization
 * and room availablity is implemented using central inventory
 *
 * @author Anjan
 * @version 3.0
 */
public class UseCase3RoomInventory {
    public static void main(String[] args){
        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        RoomInventory invertory=new RoomInventory();
        System.out.println("Single Room:");
        singleRoom.displayRoom();
        System.out.println("Available: "+invertory.getRoomAvailability().get("Single Room"));
        System.out.println("double Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+invertory.getRoomAvailability().get("Double Room"));
        System.out.println("Suite Room:");
        suiteRoom.displayRoom();
        System.out.println("Available: "+invertory.getRoomAvailability().get("Suite Room"));



    }

}
