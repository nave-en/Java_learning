public class BankAccountApplication {
    /*
     * Example for the Encapsuloation concept
     */
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber("123456");
        account.setBalance(100.0);
        account.setCustomerName("Naveen");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer Name: " + account.getCustomerName());
    }
}
