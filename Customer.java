import java.time.LocalDate;
import java.time.LocalDateTime;

public class Customer {
    public int customerId;
    public String name;
    public String phone;
    public String email;
    public LocalDate birthDate;

    public String address;
    public String subAddress;

    public String username;
    public String password;
    public LocalDateTime registerDate;
    public String status;

    public int totalOrders;
    public double totalSpent;
    public String note;
    public String paymentMethod;



    public Customer(){} //default Constructor
    public Customer(int customerId){
        this.customerId = customerId;
    }
    public Customer(String cuString, String phone){
        this.name = cuString;
        this.phone = phone;

    }
    
    public Customer(int customerId, String name, String phone, String email, LocalDate birthDate, String address, String subAddress,
                    String username, String password, LocalDateTime registerDate,
                    String status, int totalOrders, double totalSpent, String note,
                    String paymentMethod){
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.address = address;
        this.subAddress = subAddress;
        this.username = username;
        this.password = password;
        this.registerDate = registerDate;
        this.status = status;
        this.totalOrders = totalOrders;
        this.totalSpent = totalSpent;
        this.note = note;
        this.paymentMethod = paymentMethod;
                    }
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getPhone() {
        return phone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }  
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setSubAddress(String subAddress) {
        this.subAddress = subAddress;
    }
    public String getSubAddress() {
        return subAddress;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
    public void setRegisterDate(LocalDateTime registerDate) {
        this.registerDate = registerDate;
    }
    public LocalDateTime getRegisterDate() {
        return registerDate;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
    public void setTotalOrders(int totalOrders) {
        this.totalOrders = totalOrders;
    }
    public int getTotalOrders() {
        return totalOrders;
    }
    public void setTotalSpent(double totalSpent) {
        this.totalSpent = totalSpent;
    }
    public double getTotalSpent() {
        return totalSpent;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public String getNote() {
        return note;
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
    public String getPaymentMethod() {
        return paymentMethod;
    }

}