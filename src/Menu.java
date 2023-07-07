import java.util.List;
import java.util.ArrayList;
class Menu <T extends MenuItem> {
    private List<T> items;

    public Menu() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }


}
