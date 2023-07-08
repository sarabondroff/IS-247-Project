public abstract class AbstractMenuItem implements MenuItem {

    // abstract class
    private String name;
    private double price;

    // using this keyword to set name and price
    public AbstractMenuItem(String name, double price) {
        this.name = name;
        this.price = price;

    }

    // getter methods for name and price
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

