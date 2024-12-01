import java.util.*;

public class PremiumPassenger extends Passenger {
    public PremiumPassenger(String name, double balance) {
        setName(name);
        setBalance(balance);
        setActivities(new ArrayList<>());
        setPassengerNum(new Random().nextInt(10000,100000));     // random 5 digit number
        setDiscount(0);      // everything is free of charge
    }
}
