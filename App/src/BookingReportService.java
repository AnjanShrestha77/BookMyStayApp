/**
 * =================================
 * BookingReportService
 * ===================================
 *
 * this class generate booking report from the booking history
 *
 * @version 8.0
 */
public class BookingReportService {

    public void generateReport(BookingHistory history){
        System.out.println("Booking History Report: ");
        if(history.getConfirmedReservation()!=null){
            for(Reservation reservation : history.getConfirmedReservation()){
                System.out.println("Guest "+reservation.getGuestName()+", Room Type: "+reservation.getRoomType().replace(" Room"," "));
            }
        }

    }
}
