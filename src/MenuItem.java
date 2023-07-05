public class MenuItem {
    private String itemName;
    private double itemPrice;

    public MenuItem(String itemName, double itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;


    }

    public String getName() {
        return itemName;
    }

    public double getPrice() {
        return itemPrice;
    }
}
