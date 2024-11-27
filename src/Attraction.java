public class Attraction extends Activity {
    public Attraction(String name, String description, double cost, int capacity, int passengerCount, Destination destination) {
        setName(name);
        setDescription(description);
        setCost(cost);
        setCapacity(capacity);
        setPassengerCount(passengerCount);
        setDestination(destination);
    }
}