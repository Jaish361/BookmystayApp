public class BookMyStayApp {

    public static void main(String[] args) {

        // Initialize inventory
        RoomInventory inventory = new RoomInventory();

        // Display available rooms
        inventory.displayInventory();

        // Example availability check
        System.out.println("\nSingle Room Availability: " +
                inventory.getAvailability("Single"));

        // Update inventory
        inventory.updateAvailability("Single", 4);

        System.out.println("\nInventory After Update:");
        inventory.displayInventory();
    }
}