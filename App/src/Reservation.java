/**
 * Represents a confirmed reservation.
 */
public class Reservation {

    private String guestName;
    private String roomId;

    public Reservation(String guestName, String roomId) {
        this.guestName = guestName;
        this.roomId = roomId;
    }

    public String getGuestName() {
        return guestName;
    }

    public String getRoomId() {
        return roomId;
    }
}