import java.util.ArrayList;

public class SeniorPassenger extends Passenger {
    public SeniorPassenger(String name, int passengerNum, double balance, ArrayList<Activity> activities) {
        super(name, passengerNum, balance, activities);
        setDiscount(.9);     // discount of 10%
    }
}
