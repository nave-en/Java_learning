public class Rectangle extends Shape {
    private int breadth;
    public Rectangle(int len, int breadth) {
        super(len);
        this.breadth = breadth;
    }

    public int area() {
        return this.len * this.breadth;
    }
}
