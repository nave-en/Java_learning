package OOPS;

public class Rectangle {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public boolean isValidDimension() {
		if (this.length == this.breadth) {
			return false;
		}

		return true;
	}

	public double area() {
		return this.breadth * this.length;
	}

	public double perimeter() {
		return (this.length + this.breadth) * 2;
	}

	public String toString() {
		return "Length : " + this.length + ", Breadth : " + this.breadth;
	}
}
