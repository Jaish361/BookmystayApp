public class RoomSearchService {

    public void searchAvailableRooms(RoomInventory inventory) {

        Room[] rooms = {
                new SingleRoom(),
                new DoubleRoom(),
        };

        System.out.println("Available Rooms:\n");

        for (Room room : rooms) {

            int availability = inventory.getAvailability(room.getType());

            if (availability > 0) {

                room.displayDetails();
                System.out.println("Available: " + availability);
                System.out.println("----------------------");

            }
        }
    }
}