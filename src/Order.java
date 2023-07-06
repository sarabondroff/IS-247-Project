
import java.util.List;
import java.util.ArrayList;
class Order {
    private List<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public void removeItem(MenuItem item) {
        items.remove(item);

    }

    public List<MenuItem> getItems() {
        return items;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (MenuItem item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

}
