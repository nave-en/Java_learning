public class Factorial {
    public static void main(String[] args) {
        int no = 0;
        int res = 1;
        while (no > 0) {
            res *= no;
            no -= 1;
        }

        System.out.println("Factorial : " + res);
    }
}
