package Hotel;

public class Booking {
    private Client client;
    private Room room;
    private int nights;

    // Constructor:
    public Booking(Client client, Room room, int nights) {
        this.client = client;
        this.room = room;
        this.nights = nights;
    }

    // Getters:
    public Client getClient() {
        return client;
    }

    public Room getRoom() {
        return room;
    }

    public int getNights() {
        return nights;
    }

    // ToString:
    @Override
    public String toString() {
        return "Client: " + client +
                "\nRoom: " + room +
                "\nNights: " + nights;
    }
}
