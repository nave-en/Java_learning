public class BankAccount {
    private String accoutnNumber;
    private double balance;
    private String customerName;
    public void setAccountNumber(String accoutnNumber) {
        this.accoutnNumber = accoutnNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance < 0 ? 0 : balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getAccountNumber() {
        return accoutnNumber;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }

}
