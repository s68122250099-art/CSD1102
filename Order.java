
import java.util.ArrayList;
import java.util.List;

public class Order {

    public int orderId;
    public Customer customer;
    public List<OrderItem> items;
    public DeliveryRider rider;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
        System.err.println("From Order "+customer.name+" "+customer.phone);
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }

    public void assignRider(DeliveryRider rider) {
        this.rider = rider;
    }
}
