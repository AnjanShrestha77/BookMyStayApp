/**
 * ========================
 * BookingHistory
 * =======================
 *
 *this class maintain the records of confirmed booking
 *this class also provides ordered storage for historical and reporting purpose
 *
 * @version 8.0
 */

import java.util.ArrayList;
import java.util.List;

public class BookingHistory {
    private List<Reservation> confirmedReservation;

    public BookingHistory(){
        confirmedReservation= new ArrayList<>();
    }

    public void addReservation(Reservation reservation){
        confirmedReservation.add(reservation);
    }

    public List<Reservation> getConfirmedReservation() {
        return confirmedReservation;
    }
}
