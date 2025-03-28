public class JavaException {
    public static void main(String[] args) {
        System.out.println("Exception demo");
        try {
            // int b = 10 / 0;
            throw new Exception("Manually thrown Exception");
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
            System.out.println(exp);
        } finally {
            System.out.println("This is a final block");
        }
    }
}
