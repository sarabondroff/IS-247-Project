// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new Coffee("1. Coffee", 5.5);
        MenuItem item2 = new Muffin("2. Muffin", 8.0);
        MenuItem item3 = new Sandwich("3. Sandwich", 10.0);

        Menu<MenuItem> menu = new Menu<>();
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);

        Cafe<MenuItem> cafe = new Cafe(menu);

        cafe.displayMenu();

        Order<MenuItem> order = cafe.placeOrder();





            boolean isOrderValid = true;

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
        System.out.println("Thank you for coming to the cafe!");
    }
}