// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Coffee", 5.5);
        MenuItem item2 = new MenuItem("Muffin", 8.0);
        MenuItem item3 = new MenuItem("Wrap", 10.0);

        Menu menu = new Menu();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        Cafe cafe = new Cafe(menu);

        cafe.displayMenu();

        Order order = new Order();
        order.addItem(item1);
        order.addItem(item2);

        System.out.println("\nOrder: ");
        for(MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + order.getTotalPrice());


    }
}