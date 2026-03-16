public class BookMyStayApp {

    public static void main(String[] args) {

        BookingRequestQueue bookingQueue = new BookingRequestQueue();

        // Simulated guest booking requests
        Reservation r1 = new Reservation("Aditya", "Single");
        Reservation r2 = new Reservation("Rahul", "Double");
        Reservation r3 = new Reservation("Priya", "Suite");

        bookingQueue.addRequest(r1);
        bookingQueue.addRequest(r2);
        bookingQueue.addRequest(r3);

        bookingQueue.showQueue();
    }
}