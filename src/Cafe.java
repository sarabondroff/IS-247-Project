public class Cafe {
    private Menu menu;

    public Cafe(Menu menu) {
        this.menu =menu;

    }

    public void displayMenu() {
        System.out.println("Menu: ");
        for(MenuItem item : menu.getItems()) {
            System.out.println(item.getName() +" - $" + item.getPrice());
        }
    }
}
