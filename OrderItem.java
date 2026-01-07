
public class OrderItem {

    private String MenuId;
    private String MenuName;
    private int quantity;
    private double pricePerUnit;
    public MenuItem menuItem;

    public OrderItem(String MenuId) {
        this.MenuId = MenuId;
    }

    public OrderItem(String MenuId, String MenuName) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
    }

    public OrderItem(String MenuId, String MenuName, int quantity) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
    }

    public OrderItem(String MenuId, String MenuName, int quantity, double pricePerUnit) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public OrderItem(String MenuId, String MenuName, int quantity, double pricePerUnit, MenuItem menuItem) {
        this.MenuId = MenuId;
        this.MenuName = MenuName;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.menuItem = menuItem;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String MenuId) {
        this.MenuId = MenuId;
    }

    public String getMenuName() {
        return MenuName;
    }

    public void setMenuName(String MenuName) {
        this.MenuName = MenuName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }

}
