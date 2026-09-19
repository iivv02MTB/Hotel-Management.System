package Hotel;

public class Main {
    public static void main(String[] args) {

        // Create the hotel:
        Hotel hotel = new Hotel();

        // Create the clients:
        Client alex = new Client("Alex", "00000001X", "alex@example.com");
        Client pablo = new Client("Pablo", "00000002Y", "pablo@example.com");
        Client maria = new Client("Maria", "00000003Z", "maria@example.com");

        // Create several rooms:
        Room room1 = new Room(100, "Single", 50, true);
        Room room2 = new Room(101, "Double", 80, true);
        Room room3 = new Room(102, "Suite", 150, true);

        // Add the clients to the hotel:
        hotel.addClient(alex);
        hotel.addClient(pablo);
        hotel.addClient(maria);

        // Add the rooms to the hotel:
        hotel.addRoom(room1);
        hotel.addRoom(room2);
        hotel.addRoom(room3);

        // Make a booking for Alex for 3 nights:
        boolean alexBooking = hotel.bookRoom("00000001X", 101, 3);
        System.out.println("Booking completed: " + alexBooking);

        // Check that the room is no longer available:
        System.out.println("Room 101 available: " + hotel.isAvailable(101));

        // Check the total price for the 3-night stay:
        double price = hotel.calculateBookingPrice(101);
        System.out.println("Total Price: " + price + " €");

        // Cancel Alex's booking:
        boolean cancelled = hotel.cancelBooking(101);
        System.out.println("Booking cancelled: " + cancelled);

        // Check that the room is available again:
        System.out.println("Room 101 available: " + hotel.isAvailable(101));

        // Check if we can book the same room for Pablo:
        boolean pabloBooking = hotel.bookRoom("00000002Y", 101, 4);
        System.out.println("Pablo's booking: " + pabloBooking);

        // Check if the room is still available:
        System.out.println("Room 101 available: " + hotel.isAvailable(101));

        // Test a booking with 0 nights:
        boolean invalidBooking = hotel.bookRoom("00000003Z", 102, 0);
        System.out.println("Booking with 0 nights: " + invalidBooking);
    }
}
