import java.util.ArrayList;

public class WalkingTour extends Activity {
    private double distance;

    public WalkingTour(String name, String description, double cost, int capacity, int passengerCount, Destination destination, double distance) {
        setName(name);
        setDescription(description);
        setCost(cost);
        setCapacity(capacity);
        setPassengerCount(passengerCount);
        setDestination(destination);
        this.distance = distance;
    }

    // getters and setters
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
