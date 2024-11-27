import java.util.*;
public class Activity {
    private String name;
    private String description;
    private double cost;
    private int capacity;
    private int passengerCount;
    private Destination destination;

    public void printActivity() {
        System.out.println(name + " (" + destination + ")");
        System.out.println(description);
        System.out.println("$" + cost + " | " + passengerCount + "/" + capacity);

        if (capacity-passengerCount != 0) System.out.print(" (" + (capacity-passengerCount) + " spots available)");
    }
    public boolean hasSpace() {
        return passengerCount != capacity;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPassengerCount() {
        return passengerCount;
    }

    public void setPassengerCount(int passengerCount) {
        this.passengerCount = passengerCount;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }
}
