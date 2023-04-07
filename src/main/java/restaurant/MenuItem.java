package restaurant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class MenuItem {

    // TODO Declare private fields name, description, price, category, and dateAdded (Date)
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    //TODO: Define constructor to take values for first four fields as params
    public MenuItem(String name, String description, double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }
    //TODO: Define getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDateAdded() {

        return dateAdded;
    }
    //TODO: Define custom toString() method

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return name + newText + '\n' +
                description + " | $" + price;
    }

    //TODO: Define custom equals() method
    @Override
    public boolean equals(Object toBeCompared) {
        // Reference check
        if (this == toBeCompared) {
            return true;
        }

        // Null check
        if (toBeCompared == null) {
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {
            return false;
        }

        MenuItem otherItem = (MenuItem) toBeCompared;

        return this.name.equals(otherItem.getName());
    }

    //TODO: Define instance method isNew()
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        System.out.println(daysBetween + " days since " + name + " was added");
        return daysBetween < 90;
    }


}
