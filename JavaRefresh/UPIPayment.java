public class UPIPayment extends Payment {
    public UPIPayment(double amount) {
        this.amount = amount;
    }

    public void processPayment() {
        System.out.println("UPI payment processed : " + amount);
    }
    
}
