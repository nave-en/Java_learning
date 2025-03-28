public class PrimeNumber {
    public static void main(String[] args) {
        int no = 19;
        if (no <= 1) {
            System.out.println("not a prime");
        } else if (no <= 3) {
            System.out.println("prime");
        } else {
            boolean isPrime = true;
            for (int div = 2; div <= Math.sqrt(no); div++) {
                if (no % div == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println("Its a prime number");
            } else {
                System.out.println("Its not a prime number");
            }
        }
    }
}