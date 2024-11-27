import java.util.*;
public class Cruiseship {
    private String name;
    private int capacity;
    private ArrayList<Destination> itinerary;
    private ArrayList<Passenger> passengers;

    public Cruiseship(String name, int capacity, ArrayList<Destination> itinerary, ArrayList<Passenger> passengers) {
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

    public void printItinerary() {
        System.out.println("Cruiseship: " + name);
        System.out.println("Total Destinations: " + itinerary.size());

        for (int i = 0; i < itinerary.size(); i++) {
            itinerary.get(i).printActivities();
        }
    }

    public void printPassengers() {
        System.out.println("Cruiseship: " + name);
    }

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
