import java.util.*;
public class Destination {
    private String name;
    private ArrayList<Activity> activities;

    public Destination(String name) {
        this.name = name;
        activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        boolean add = true;

        for (Activity a : activities) {
            if (a.getClass() == activity.getClass()) {
                add = false;
                break;
            }
        }

        if (add) activities.add(activity);
    }

    public void printActivitiesAtDestination() {
        System.out.println("\033[0;1m" + name.toUpperCase() + ": " + "\033[0m");
        for (int i = 0; i < activities.size(); i++) {
            activities.get(i).printActivity();
            if (activities.get(i) instanceof TheatreShow) {
                ((TheatreShow) activities.get(i)).printStars();
            }
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
