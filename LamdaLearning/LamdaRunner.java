public class LamdaRunner {
    public static void main(String[] args) {
        LamdaExample add = (a, b) -> a + b;
        LamdaExample sub = (a, b) -> a - b;
        int addResult = add.operation(10, 5);
        int subResult = sub.operation(10, 5);
        System.out.println("Addition of two numbers : " + addResult);
        System.out.println("Substraction of two numbers : " + subResult);
    }
}
