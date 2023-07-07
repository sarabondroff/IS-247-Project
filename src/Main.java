// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new Coffee("Coffee", 5.5);
        MenuItem item2 = new Muffin("Muffin", 8.0);
        MenuItem item3 = new Sandwich("Sandwich", 10.0);

        Menu<MenuItem> menu = new Menu<>();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        Cafe<MenuItem> cafe = new Cafe(menu);

        cafe.displayMenu();

        Order<MenuItem> order = new Order<>();

            order.addItem(item1);
            order.addItem(item2);

            boolean isOrderValid = false;

            try {
                if (!isOrderValid) {
                    throw new OrderException("Order is Inavlid!");
                }

        } catch (OrderException e) {
            System.out.println("Order error: " + e.getMessage());
        }

        System.out.println("\nOrder: ");
        for(MenuItem item : order.getItems()) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total Price: $" + order.getTotalPrice());
    }
}