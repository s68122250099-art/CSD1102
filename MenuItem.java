
public class MenuItem {

    //2 กำหนด private instance + public static variable
    public int menuId;
    private String name;
    private double price;
    private String description;
    private String picture;

    //1 สร้าง Constructor ของทุก class อย่างน้อย 2 Constructors
    public MenuItem(int menuId) {
        this.menuId = menuId;
        this.name = "ไม่มีชื่อเมนู";
    }

    public MenuItem(int menuId, String name, double price) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
    }

    public MenuItem(int menuId, String name, double price, String description) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public MenuItem(int menuId, String name, double price, String description, String picture) {
        this.menuId = menuId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.picture = picture;
    }

    //3 สร้าง method get/set ของทุกๆ attributes
    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
}
