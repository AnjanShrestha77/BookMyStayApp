/**
 * =============================
 * MAIN CLASS
 * ==============================
 *
 * this class demonstrate how booking request are confirmed
 * it consumes booking order in FIFO and update inventory immediately
 * @author anjan
 * @version 6.0
 */
public class UseCase6RoomAllocation {

    public static void main(String[] args) {

        RoomInventory inventory=new RoomInventory();
        RoomAllocationService service=new RoomAllocationService();

        Reservation r1 = new Reservation("Nikhil", "Single Room");
        Reservation r2 = new Reservation("Anjan", "Suite Room");
        Reservation r3 = new Reservation("Sulav", "Single Room");

        System.out.println("Room allocating Service");
        service.allocateRoom(r1,inventory);
        service.allocateRoom(r2,inventory);
        service.allocateRoom(r3,inventory);


    }
}
