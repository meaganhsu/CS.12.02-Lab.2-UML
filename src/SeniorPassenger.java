import java.util.*;

public class SeniorPassenger extends Passenger {
    public SeniorPassenger(String name, double balance) {
        super(name, balance);
        setActivities(new ArrayList<>());
        setPassengerNum(new Random().nextInt(10000,100000));     // random 5 digit number
        setDiscount(.9);     // discount of 10%
    }
}
