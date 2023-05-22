public class Checkout {
    private ShoppingCart cart;
    private PaymentProcessor paymentProcessor;

    public Checkout(ShoppingCart cart, PaymentProcessor paymentProcessor) {
        this.cart = cart;
        this.paymentProcessor = paymentProcessor;
    }

    public boolean processCheckout(){
        double total = cart.getTotal();
        boolean status = paymentProcessor.processPayment(total);
        if(status){
            System.out.println("Payment processed successfully.");
        } else {
            System.out.println("Payment processing failed.");
        }
        return status;
    }
}
