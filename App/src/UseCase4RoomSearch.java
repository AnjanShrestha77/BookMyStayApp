/**
 * main class
 *
 * use case 4 - Room Search
 * description : this class demonstrate the availability of room and details without modifying any data
 *
 * @author Anjan
 * @version 4.0
 */
public class UseCase4RoomSearch {
    public static void main(String[] args){
        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        RoomInventory inventory=new RoomInventory();
        RoomSearchService searchService=new RoomSearchService();
        searchService.searchAvailableRooms(inventory,singleRoom,doubleRoom,suiteRoom);


    }

}
