import java.util.LinkedList;
import java.util.Queue;

/**
 * BookingRequestQueue stores incoming booking requests.
 * Requests are handled in FIFO order.
 */
public class BookingRequestQueue {

    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        requestQueue = new LinkedList<>();
    }

    // Add booking request
    public void addRequest(Reservation reservation) {

        requestQueue.add(reservation);

        System.out.println("Booking request added:");
        reservation.displayReservation();
    }

    // Display queue
    public void showQueue() {

        System.out.println("\nCurrent Booking Queue:");

        for (Reservation r : requestQueue) {
            r.displayReservation();
        }
    }
}