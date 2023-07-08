
import java.util.List;
import java.util.ArrayList;

class Order<T extends MenuItem>{
    private List<T> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);

    }

    public List<T> getItems() {
        return items;
    }
    // total price method
    public double getTotalPrice() {
        double totalPrice = 0;
        for (T item : items) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

}
