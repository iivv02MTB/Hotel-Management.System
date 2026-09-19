package Hotel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Hotel {
    private List<Client> clientList = new ArrayList<>();
    private List<Room> roomList = new ArrayList<>();
    private List<Booking> bookingList = new ArrayList<>();

    // Method to add clients:
    public void addClient(Client client) {
        if (client != null) {
            clientList.add(client);
        }
    }

    // Method to add rooms:
    public void addRoom(Room room) {
        if (room != null) {
            roomList.add(room);
        }
    }

    // Method to add bookings:
    public void addBooking(Booking booking) {
        if (booking != null) {
            bookingList.add(booking);
        }
    }

    public void showClients() {
        for (Client client : clientList) {
            System.out.println(client);
        }
    }

    public void showRooms() {
        for (Room room : roomList) {
            System.out.println(room);
        }
    }

    public void showBookings() {
        for (Booking booking : bookingList) {
            System.out.println(booking);
        }
    }

    public Client findClient(String idNumber) {
        for (Client client : clientList) {
            if (client.getIdNumber().equals(idNumber)) {
                return client;
            }
        }
        return null;
    }

    public Room findRoom(int number) {
        for (Room room : roomList) {
            if (room.getNumber() == number) {
                return room;
            }
        }
        return null;
    }

    public boolean bookRoom(String idNumber, int roomNumber, int nights) {
        Client client = findClient(idNumber);
        Room room = findRoom(roomNumber);

        if (client != null && room != null && room.isAvailable()) {
            if (nights > 0) {
                Booking booking = new Booking(client, room, nights);
                bookingList.add(booking);
                room.setAvailable(false);
                return true;
            }
        }

        return false;
    }

    public boolean cancelBooking(int roomNumber) {
        Room room = findRoom(roomNumber);

        Iterator<Booking> iterator = bookingList.iterator();

        while (iterator.hasNext()) {
            Booking booking = iterator.next();

            if (booking.getRoom().getNumber() == roomNumber) {
                room.setAvailable(true);
                iterator.remove();
                return true;
            }
        }

        return false;
    }

    public double calculateBookingPrice(int roomNumber) {
        for (Booking booking : bookingList) {
            if (booking.getRoom().getNumber() == roomNumber) {
                double totalPrice =
                        booking.getNights() * booking.getRoom().getPricePerNight();

                return totalPrice;
            }
        }

        return 0;
    }

    public boolean isAvailable(int roomNumber) {
        Room room = findRoom(roomNumber);

        if (room != null) {
            return room.isAvailable();
        }

        return false;
    }

    public void showClientBookings(String idNumber) {
        for (Booking booking : bookingList) {
            if (booking.getClient().getIdNumber().equals(idNumber)) {
                System.out.println(booking);
            }
        }
    }

    public List<Booking> findClientBookings(String idNumber) {
        List<Booking> bookings = new ArrayList<>();

        for (Booking booking : bookingList) {
            if (booking.getClient().getIdNumber().equals(idNumber)) {
                bookings.add(booking);
            }
        }

        return bookings;
    }
}
