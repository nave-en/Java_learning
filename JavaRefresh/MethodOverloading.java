public class MethodOverloading {
    public static void main(String[] args) {
        displayDetails(10, 16);
        displayDetails( 16);
        displayDetails(16.5);
    }

    public static void displayDetails(int a, int b) {
        System.out.println("INT 2 param values  : ");
        System.out.println("A : " + a + ", B : " + b);
    }

    public static void displayDetails(int a) {
        System.out.println("INT 1 param values  : ");
        System.out.println("A : " + a);
    }

    public static void displayDetails(double a) {
        System.out.println("Double 1 param values  : ");
        System.out.println("A : " + a);
    }
}
