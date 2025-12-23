public class MenuItem {
    public int menuId;
    public String name;
    public double price;

    public MenuItem(int menuId, String name, double price) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
