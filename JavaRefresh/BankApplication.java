public class BankApplication {
    public static void main(String[] args) {
        SBI sbi = new SBI(255, 5);
        System.out.println("Total Amount : " + sbi.getTotalAmount());
    }
}