public class IOBBank {
    private double rateOfInterest;
    private double amount;
    private double year;
    public IOBBank(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }
    
    public double getInterestRate() {
        return rateOfInterest;
    }
    
    public void displayDetails() {
        System.out.println("Interest rate : " + rateOfInterest);
    }

    public double calculateInterest() {
        return amount * rateOfInterest * year / 100;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setYear(double year) {
        this.year = year;
    }

    public double getAmount() {
        return amount;
    }

    public double getTotalAmount() {
        return amount + calculateInterest();
    }
}
