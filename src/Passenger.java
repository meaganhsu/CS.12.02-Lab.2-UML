import java.util.*;

public class Passenger {
    private String name;
    private int passengerNum;
    private double discount;
    private double balance;
    private ArrayList<Activity> activities;

    public boolean signUp(Activity activity) {
        for (Activity a : activities) {
            // passengers can only sign up for maximum 1 activity per destination
            if (a.getDestination() == activity.getDestination()) return false;
        }

        if (balance >= discount * activity.getCost() && activity.hasSpace()) {
            activities.add(activity);    // adding activity to passenger's itinerary
            setBalance(balance - discount * activity.getCost());      // deducting activity cost from balance
            activity.setPassengerCount(activity.getPassengerCount()+1);      // decreasing activity passenger count by 1
            return true;
        }

        return false;
    }

    public void printPassengerInfo() {
        System.out.println("\033[0;1m" + name.toUpperCase() + "\033[0m");
        System.out.println("Passenger id: " + passengerNum);
        System.out.println("Balance: $" + balance);
        System.out.println("Registered Activities:");

        for (Activity a : activities) {
            System.out.println("  - " + a.getName() + " (" + a.getDestination().getName() + ") —— $" + (discount * a.getCost()));
        }
        System.out.println();
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return discount;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public int getPassengerNum() {
        return passengerNum;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setPassengerNum(int passengerNum) {
        this.passengerNum = passengerNum;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}
