
public class Main {

    public static void withdraw(double balance, double amount) {

        if (amount > balance) {
            throw new MyTestException("Insufficient balance", 2001);
        }
        if (amount < 0) {
            throw new MyTestException("Amount cannot be negative", 2002);
        }
        if (amount > 20000) {
            throw new MyTestException("Exceed withdrawal limit", 2003);
        }

        if (amount <= 0) {
            throw new MyTestException("Invalid withdrawal amount", 2004);
        }

        System.out.println("Withdraw successful");
        System.out.println("Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {

        double balance = 1000;
        double amount = 1500;

        try {
            withdraw(balance, amount);
        } catch (MyTestException ex) {
            System.out.println("Error code: " + ex.getErrorCode());
            System.out.println("Message: " + ex.getMessage());
        }
    }
}
