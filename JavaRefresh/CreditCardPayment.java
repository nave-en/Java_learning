public class CreditCardPayment extends Payment {
    public CreditCardPayment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("Credit card payment processed : " + amount);
    }
}
