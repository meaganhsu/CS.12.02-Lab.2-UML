import java.util.*;
public class Cruise {
    private String name;
    private int capacity;
    private ArrayList<Destination> itinerary;
    private ArrayList<Passenger> passengers;

    public Cruise(String name, int capacity, ArrayList<Destination> itinerary, ArrayList<Passenger> passengers) {
        this.name = name;
        this.capacity = capacity;
        this.itinerary = itinerary;
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger) {
        if (!passengers.contains(passenger)) passengers.add(passenger);
    }

    public void addDestination(Destination destination) {
        if (!itinerary.contains(destination)) itinerary.add(destination);
    }

    // "\033[0;1m"   "\033[0m"

    public void printItinerary() {
        System.out.println("Cruise: " + "\033[0;1m" + name + "\033[0m");
        System.out.println("Total Destinations: " + itinerary.size() + "\n");

        for (Destination d : itinerary) d.printActivitiesAtDestination();
        System.out.println();
    }

    public void printPassengers() {
        System.out.println("Cruise: " + "\033[0;1m" + name + "\033[0m");
        System.out.println("Passenger Capacity: " + capacity);
        System.out.println("Number of Passengers: " + passengers.size() + "\n");

        for (Passenger p : passengers) System.out.println("  - " + p.getName() + " (passenger id: " + p.getPassengerNum() + ")");
        System.out.println();
    }

    public void printAvailableActivities() {
        System.out.println("\033[0;1m" + "Available Activities: " + "\033[0m");

        for (Destination destination : itinerary) {
            for (Activity a : destination.getActivities()) {
                if (a.hasSpace()) a.printActivity();
            }
        }
        System.out.println("\n\n");
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<Destination> getItinerary() {
        return itinerary;
    }

    public void setItinerary(ArrayList<Destination> itinerary) {
        this.itinerary = itinerary;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }
}
