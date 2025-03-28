public class ShapeRunner {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 5);
        System.out.println("Area of the rectangle : " + rect.area());
        Square squ = new Square(10);
        System.out.println("Area of the Square : " + squ.area());
    }
}
