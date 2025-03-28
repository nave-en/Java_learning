public class CalculatorRunner {
    public static void main(String[] args) {
        System.out.println("Counter Variable : " + Calculator.accessVariable());
        Calculator cal = new Calculator(10, 5);
        System.out.println("Number 1 : " + cal.getNo1());
        System.out.println("Number 2 : " + cal.getNo2());
        System.out.println("Addition of two numbers : " + cal.add());
        System.out.println("Substraction of two numbers : " + cal.sub());
        System.out.println("Multiplication of two numbers : " + cal.mul());
        System.out.println("Division of two numbers : " + cal.div());
        System.out.println("Counter Variable : " + Calculator.accessVariable());
    }
}
