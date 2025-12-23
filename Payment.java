public class Payment {
    public int paymentId;
    public double amount;
    public String method; // Cash, Credit, PromptPay

    public Payment(int paymentId, double amount, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        System.err.println("From Payment "+amount);
    }

    public void pay() {
        System.out.println("Paid " + amount + " by " + method);
    }
}
