import java.util.*;

/**
 * Shared booking request queue.
 */
public class BookingRequestQueue {

    private Queue<BookingRequest> queue = new LinkedList<>();

    public void addRequest(BookingRequest request) {
        queue.offer(request);
    }

    public BookingRequest getRequest() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}