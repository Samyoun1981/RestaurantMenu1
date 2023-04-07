package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    //TODO: Declare two private fields, menuItems (ArrayList<MenuItems>) and lastUpdated (Date)
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;     //<----don't assign any value until you add first item, because you're not defining a real value, you're defining a class
    // No constructor definition - allow for default constructor

    //TODO: Define getters and setters as needed
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }


    //TODO: Define custom isString() method
    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : menuItems) {
            if (item.getCategory().equals("appetizer")) {
                appetizers.append(item.toString());
            }
        }
        return "Turkey Shack Menu\n" +
        "\nAPPETIZERS\n" + appetizers.toString();

    }
    //TODO: Define addItem()
    //Make sure to update lastUpdated anytime something is successfully added
    //BONUS MISSION: prevent addition of duplicates
    void addItem(MenuItem item) {
        menuItems.add(item);
        lastUpdated = new Date();
    }
    //TODO: Define removeItem()
    //Make sure to update lastUpdated anytime something is removed
    void removeItem(MenuItem item) {
        menuItems.remove(item);
        lastUpdated = new Date();
    }
}
