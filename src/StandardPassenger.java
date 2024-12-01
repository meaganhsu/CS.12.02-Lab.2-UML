import java.util.*;

public class StandardPassenger extends Passenger {
    public StandardPassenger(String name, double balance) {
        setName(name);
        setBalance(balance);
        setActivities(new ArrayList<>());
        setPassengerNum(new Random().nextInt(10000,100000));     // random 5 digit number
        setDiscount(1);    // no discount
    }
}
