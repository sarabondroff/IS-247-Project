class Cafe<T extends MenuItem> {
    private Menu<T> menu;

    public Cafe(Menu<T> menu) {
        this.menu =menu;

    }

    public void displayMenu() {
        System.out.println("Menu: ");
        for(MenuItem item : menu.getItems()) {
            System.out.println(item.getName() +" - $" + item.getPrice());
        }
    }
}
