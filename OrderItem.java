public class OrderItem {
    public MenuItem menuItem;
    public int quantity;

    public OrderItem(MenuItem menuItem, int quantity) {
        this.menuItem = menuItem;
        this.quantity = quantity;
        System.err.println("From OrderItem "+menuItem.name+" "+quantity);
    }

    public double getTotalPrice() {
        return menuItem.getPrice() * quantity;
    }
}
