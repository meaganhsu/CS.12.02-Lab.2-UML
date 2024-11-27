import java.util.ArrayList;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, int passengerNum, double balance, ArrayList<Activity> activities) {
        super(name, passengerNum, balance, activities);
        setDiscount(0);      // everything is free of charge
    }
}
