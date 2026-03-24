/**
 * =========================================
 * MAIN CLASS: UseCase8BookingHistoryReport
 * =========================================
 *
 * this class demonstrates how confirmed booking are stored and reported
 * @author anjan
 * @version 8.0
 */

public class UseCase8BookingHistoryReport {

    public static void main (String[] args){

        BookingHistory history=new BookingHistory();
        history.addReservation(new Reservation("Anjan","Single Room"));
        history.addReservation(new Reservation("Nikhil","Double Room"));
        history.addReservation(new Reservation("Sulav","Suite Room"));

        BookingReportService service=new BookingReportService();

        service.generateReport(history);
    }

}
