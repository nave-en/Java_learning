public class Square extends Shape{
    public Square(int len) {
        super(len);
    }

    public int area() {
        return this.len * this.len;
    }
}
