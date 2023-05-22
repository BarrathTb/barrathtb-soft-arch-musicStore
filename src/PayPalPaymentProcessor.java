public class PayPalPaymentProcessor implements PaymentProcessor{
    private String emailId;
    private String password;

    public PayPalPaymentProcessor(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }

    @Override
    public boolean processPayment(double amount) {
        // Logic to process payment using PayPal API
        return true;
    }
}

