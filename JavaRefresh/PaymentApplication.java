public class PaymentApplication {
    public static void main(String[] args) {
        UPIPayment upi = new UPIPayment(1000);
        upi.processPayment();
        CreditCardPayment card = new CreditCardPayment(2000);
        card.processPayment();
    }
}
