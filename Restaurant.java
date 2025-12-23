import java.util.List;

public class Restaurant {
    public int restaurantId;
    public String name;
    public List<MenuItem> menu;

    public Restaurant(int restaurantId, String name, List<MenuItem> menu) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.menu = menu;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public String getName() {
        return name;
    }
}
