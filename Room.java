package Hotel;

public class Room {
    private int number;
    private String type;
    private double pricePerNight;
    private boolean available;

    // Constructor:
    public Room(int number, String type, double pricePerNight, boolean available) {
        this.number = number;
        this.type = type;
        this.pricePerNight = pricePerNight;
        this.available = available;
    }

    // Getters:
    public int getNumber() {
        return number;
    }

    public String getType() {
        return type;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public boolean isAvailable() {
        return available;
    }

    // Setter:
    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Room: " + number +
                "\nType: " + type +
                "\nPrice Per Night: " + pricePerNight +
                "\nAvailable: " + available;
    }
}
