import java.util.ArrayList;

public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, int passengerNum, double balance, ArrayList<Activity> activities) {
        super(name, passengerNum, balance, activities);
        setDiscount(1);    // no discount
    }
}
