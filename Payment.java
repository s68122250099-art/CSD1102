
public class Payment {

    // 2) private instance variables (อย่างน้อย 5 ตัว)
    public int paymentId;
    private double amount;
    private String method;          // Cash, Credit, PromptPay
    private String status;          // PAID, PENDING, FAILED
    private String paymentDate;     // วันที่ชำระเงิน
    private String transactionRef;  // เลขอ้างอิงธุรกรรม

    // 1) Constructors อย่างน้อย 2 ตัว
    public Payment(int paymentId) {
        this.paymentId = paymentId;
        this.status = "PENDING";
    }

    public Payment(int paymentId, double amount) {
        this(paymentId);
        this.amount = amount;
    }

    public Payment(int paymentId, double amount, String method,
            String payerName, String paymentDate) {
        this(paymentId, amount);
        this.method = method;
        this.paymentDate = paymentDate;
        this.status = "PAID";
    }

    // 3) getters / setters ครบทุก attribute
    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getTransactionRef() {
        return transactionRef;
    }

    public void setTransactionRef(String transactionRef) {
        this.transactionRef = transactionRef;
    }
}
