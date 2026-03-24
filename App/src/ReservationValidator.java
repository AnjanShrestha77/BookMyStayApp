/**
 * =============================
 * ReservationValidator
 * =============================
 * this class is responsible for validating booking requests before they processed
 *
 * @version 9.0
 */
public class ReservationValidator {
    public void validate(String guestName,String roomType,RoomInventory inventory) throws InvalidBookingException{
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        if (!inventory.getRoomAvailability().containsKey(roomType)) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        if (inventory.getRoomAvailability().get(roomType) <= 0) {
            throw new InvalidBookingException("Selected room is not available.");
        }

    }
}
