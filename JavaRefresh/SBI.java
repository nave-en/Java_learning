public class SBI extends Bank{
    private double amount;
    public SBI(double amount, double interest) {
        super(7.5);
        this.amount = amount;
    }
    public double getInterestRate() {
        return this.rateOfInterest;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getTotalAmount() {
        return this.amount * this.rateOfInterest;
    }
}