import java.util.*;
public class Destination {
    private String name;
    private ArrayList<Activity> activities;

    public Destination(String name, ArrayList<Activity> activities) {
        this.name = name;
        this.activities = activities;
    }

    public void addActivity(Activity activity) {
        if (!activities.contains(activity)) activities.add(activity);
    }

    public void printActivitiesAtDestination() {
        System.out.println(name + ": ");
        for (int i = 0; i < activities.size(); i++) {
            activities.get(i).printActivity();

//            System.out.println(i+1 + ". " + activities.get(i).getName() + " ($" + activities.get(i).getCost() + ", " + activities.get(i).getCapacity() + " participants.)");
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

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }
}
