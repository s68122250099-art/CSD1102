import java.time.LocalTime;

public class Restaurant {


    public int restaurantId;
    private String name;
    private String address;
    private String phone;
    private String email;

    private LocalTime openTime;
    private LocalTime closeTime;

    private boolean available;
    private double rating;
    private int totalOrders;


    public Restaurant() {
    }

    public Restaurant(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public Restaurant(int restaurantId, String name) {
        this.restaurantId = restaurantId;
        this.name = name;
    }

    public Restaurant(int restaurantId, String name, String address, String phone) {
        this(restaurantId, name);
        this.address = address;
        this.phone = phone;
    }

    public Restaurant(int restaurantId, String name, String address, String phone,
                      LocalTime openTime, LocalTime closeTime,
                      boolean available, double rating, int totalOrders) {
        this.restaurantId = restaurantId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.available = available;
        this.rating = rating;
        this.totalOrders = totalOrders;
    }


    public int getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(int restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(LocalTime openTime) {
        this.openTime = openTime;
    }

    public LocalTime getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(LocalTime closeTime) {
        this.closeTime = closeTime;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getTotalOrders() {
        return totalOrders;
    }

    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }
}