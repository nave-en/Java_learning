public class Fibonacci {
    public static void main(String[] args) {
        int no = 8;
        int first = 0, second = 1;
        System.out.print(first + " -> " + second + " -> ");
        int ind = 3;
        while (ind <= no) {
            int temp = first + second;
            first = second;
            second = temp;
            System.out.print(second + " -> ");
            ind++;
        }
    }
}
