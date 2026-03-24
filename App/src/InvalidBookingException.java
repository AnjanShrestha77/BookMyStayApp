/**
 * ===================================
 * InvalidBookingException
 * ===================================
 * this custom exception represent  invalid booking scenarios in the system
 *
 * @version 9.0
 */
public class InvalidBookingException extends Exception{

    public InvalidBookingException(String message){
        super(message);
    }

}
