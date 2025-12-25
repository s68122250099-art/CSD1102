
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

        // 2️⃣ MenuItem 4 สร้าง objects ตาม จำนวน constructors ของ class
        MenuItem pizza = new MenuItem(101);
        MenuItem pizza2 = new MenuItem(102, "Pizza2");
        MenuItem pizza3 = new MenuItem(103, "Pizza3", 120.0);

        // 3️⃣ Restaurant
        List<MenuItem> menuList = new ArrayList<>();
        menuList.add(pizza);
        menuList.add(pizza2);
        menuList.add(pizza3);

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
        OrderItem item2 = new OrderItem(pizza2, 2);
        OrderItem item3 = new OrderItem(pizza3, 1);

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
