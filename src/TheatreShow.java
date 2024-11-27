import java.util.*;
public class TheatreShow extends Activity {
    private ArrayList<String[]> starsAndRoles;

    public TheatreShow(String name, String description, double cost, int capacity, int passengerCount, Destination destination, ArrayList<String[]> starsAndRoles) {
        setName(name);
        setDescription(description);
        setCost(cost);
        setCapacity(capacity);
        setPassengerCount(passengerCount);
        setDestination(destination);
        this.starsAndRoles = starsAndRoles;
    }

    // getters and setters
    public ArrayList<String[]> getStarsAndRoles() {
        return starsAndRoles;
    }

    public void setStarsAndRoles(ArrayList<String[]> starsAndRoles) {
        this.starsAndRoles = starsAndRoles;
    }
}
