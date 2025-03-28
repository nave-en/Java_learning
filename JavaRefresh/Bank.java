public abstract class Bank {
    public double rateOfInterest;
    public abstract double getInterestRate();
    public void displayDetails() {
        System.out.println("Interest rate : " + rateOfInterest);
    }

    public Bank(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
}
