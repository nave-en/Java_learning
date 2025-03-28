public class BankInterfaceApplication {
    public static void main(String[] args) {
        SBIBank sbi = new SBIBank(8.5);
        sbi.setAmount(10000);
        sbi.setYear(2);
        sbi.displayDetails();
        System.out.println("Total amount : " + sbi.getTotalAmount());
        IOBBank iob = new IOBBank(9);
        iob.setAmount(10000);
        iob.setYear(2);
        iob.displayDetails();
        System.out.println("Total amount : " + iob.getTotalAmount());
    }
}
