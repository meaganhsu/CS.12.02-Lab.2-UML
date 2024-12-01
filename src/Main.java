import java.util.*;

public class Main {
    public static void main(String[] args) {     // testing
        StandardPassenger john = new StandardPassenger("John Lennon", 10000);
        SeniorPassenger bob = new SeniorPassenger("Bob Dylan", 2000);
        PremiumPassenger michael = new PremiumPassenger("Michael Jackson", 50000);
        PremiumPassenger meagan = new PremiumPassenger("Meagan Hsu", 2000000);

        ArrayList<Passenger> passengers = new ArrayList<>();
        passengers.add(john);
        passengers.add(bob);
        passengers.add(michael);
        passengers.add(meagan);

        Destination nyc = new Destination("New York City");
        Destination newport = new Destination("Newport");

        ArrayList<Destination> itinerary = new ArrayList<>();
        itinerary.add(nyc);
        itinerary.add(newport);

        ArrayList<String[]> stars = new ArrayList<>();
        stars.add(new String[] {"Jeremy Jordan", "Jay Gatsby"});
        stars.add(new String[] {"Eva Noblezada", "Daisy Buchanan"});

        TheatreShow gatsby = new TheatreShow("The Great Gatsby", "A vibrant adaptation.", 100, 500, 499, nyc, stars);
        Attraction statue = new Attraction("Statue of Liberty", "A historical landmark.", 10, 20, 12, nyc);
        WalkingTour cliff = new WalkingTour("Cliff Tour", "An easy hike.", 8, 10, 5, newport, 5.6);
        nyc.addActivity(gatsby);
        nyc.addActivity(statue);
        newport.addActivity(cliff);

        Cruise cruise = new Cruise("The Allure", 3200, itinerary, passengers);

        meagan.signUp(gatsby);
        meagan.signUp(cliff);
        john.signUp(gatsby);
        michael.signUp(cliff);
        bob.signUp(statue);
        john.signUp(statue);

        cruise.printItinerary();
        cruise.printPassengers();
        cruise.printAvailableActivities();

//        System.out.println();

        for (Passenger p : passengers) {
            p.printPassengerInfo();
        }
    }
}
