public class CreditCardPaymentProcessor implements PaymentProcessor {
    private String cardNumber;
    private String cvv;

    public CreditCardPaymentProcessor(String cardNumber, String cvv) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    @Override
    public boolean processPayment(double amount) {
        // Logic to process payment using Credit Card API
        return true;
    }
}
