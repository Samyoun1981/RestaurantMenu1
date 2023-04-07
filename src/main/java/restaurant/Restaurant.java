package restaurant;

public class Restaurant {

    public static void main(String[] args) {

        //TODO: Create various menu items
        MenuItem item1  = new MenuItem(  "4 Giant Turkey Tacos", "4 large deliciously seasoned turkey tacos",  15.50, "main course");
        MenuItem item2 = new MenuItem( " Turkey Polish Sausage ",  " Chicago-styled turkey polish ",  9.50, " main course " );
        MenuItem item3 = new MenuItem( " Turkey Bacon Cheesy Fries ",  " Crispy fries covered with cheese and turkey bacon bits ",  7.50, " appetizer " );
        MenuItem item4 = new MenuItem( " Collard Greens Smoked Turkey Soup ",  " Tasty spicy soup with collard greens and smoked turkey ",  8.50, " appetizer " );
        MenuItem item5 = new MenuItem( " Chocolate Snowfall ",  " Fried Oreo cookies over vanilla ice cream ",  6.50, " dessert " );

        //TODO: Create a menu
        Menu menu = new Menu();

        //TODO: Add menu items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);


        System.out.println(menu.getMenuItems().size());

        //TODO: Print the entire menu
        System.out.println(menu);

        //TODO: Print just one menu item
        System.out.println(item4);

        //TODO: Remove an item and reprint menu



        //BONUS MISSION

        //TODO: Try to add a duplicate
    }
}

