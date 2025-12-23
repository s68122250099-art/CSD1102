
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // 1️⃣ Customer
        Customer customer = new Customer(
                1,
                "สมชาย",
                "0891234567"
        );

        // 2️⃣ MenuItem
        MenuItem pizza = new MenuItem(101, "Pizza", 250.0);
        MenuItem burger = new MenuItem(102, "Burger", 120.0);

        // 3️⃣ Restaurant
        List<MenuItem> menuList = new ArrayList<>();
        menuList.add(pizza);
        menuList.add(burger);

        Restaurant restaurant = new Restaurant(
                10,
                "Good Food",
                menuList
        );

        // 4️⃣ Order
        Order order = new Order(
                1001,
                customer
        );

        // 5️⃣ OrderItem
        OrderItem item1 = new OrderItem(pizza, 1);
        OrderItem item2 = new OrderItem(burger, 2);

        order.addItem(item1);
        order.addItem(item2);

        // 6️⃣ Payment
        Payment payment = new Payment(
                5001,
                order.calculateTotal(),
                "PromptPay"
        );

        // 7️⃣ DeliveryRider
        DeliveryRider rider = new DeliveryRider(
                301,
                "Rider A"
        );

        order.assignRider(rider);

        // แสดงผล
        payment.pay();
        System.out.println("Customer: " + customer.getName());
        System.out.println("Restaurant: " + restaurant.getName());
        System.out.println("Total Price: " + order.calculateTotal());
        System.out.println("Rider: " + rider.getName());
    }
}
