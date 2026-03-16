/**
 * main class
 *
 * use case 2 - room initialization
 * description : this class demonstrate the room initialization
 * availability is represented using simple variables
 *
 * @author Anjan
 * @version 2.0
 */
public class UseCase2RoomInitailization {
    public static void main(String[] args){
        int singleAvailable=5;
        int doubleAvailable=3;
        int suiteAvailable=2;
        SingleRoom singleRoom=new SingleRoom();
        DoubleRoom doubleRoom=new DoubleRoom();
        SuiteRoom suiteRoom=new SuiteRoom();
        System.out.println("Sigle Room:");
        singleRoom.displayRoom();
        System.out.println("Available: "+singleAvailable);
        System.out.println("double Room:");
        doubleRoom.displayRoom();
        System.out.println("Available: "+doubleAvailable);
        System.out.println("Suite Room:");
        suiteRoom.displayRoom();
        System.out.println("Available: "+suiteAvailable);



    }

}
