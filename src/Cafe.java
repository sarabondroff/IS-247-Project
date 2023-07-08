import java.util.Scanner;
class Cafe<T extends MenuItem> {
    private Menu<T> menu;

    public Cafe(Menu<T> menu) {
        this.menu =menu;

    }

    public void displayMenu() {
        System.out.println("⋆ ˚｡⋆୨୧˚Welcome to the Cafe!⋆ ˚｡⋆୨୧˚");
        System.out.println("Menu: ");
        for(T item : menu.getItems()) {
            System.out.println(item.getName() +" - $" + item.getPrice());
        }
    }

    public Order <T> placeOrder() {
        Scanner scanner = new Scanner(System.in);
        Order <T> order = new Order<>();

        System.out.println("Enter the item number to add to your order. Press 0 to finish ordering.");

        int itemNumber;
        do {
            itemNumber = scanner.nextInt();
            if(itemNumber > 0 && itemNumber <= menu.getItems().size()) {
                T selectedItem = menu.getItems().get(itemNumber - 1);
                order.addItem(selectedItem);
                System.out.println("Added " + selectedItem.getName() + " to your order.");

            } else if (itemNumber != 0 ){
                System.out.println("Invalid item number. Try again");
            }
        } while (itemNumber != 0);

        System.out.println("Order placed!");
        return order;

    }

}
