
public class BookMyStayApp {

    public static void main(String[] args) {

        // Creating room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();

        // Static availability variables
        int singleRoomAvailable = 5;
        int doubleRoomAvailable = 3;
        int suiteRoomAvailable = 2;

        System.out.println("===== Room Details =====");

        System.out.println("\nSingle Room:");
        singleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + singleRoomAvailable);

        System.out.println("\nDouble Room:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available Rooms: " + doubleRoomAvailable);

        System.out.println("\nApplication Terminated.");
    }
}