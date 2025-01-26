package OOPS;

public class RectangleRunner {

	public static void main(String[] args) {
		Rectangle rt = new Rectangle(10, 5);
		System.out.println(rt.toString());
		System.out.println("Is valid dimension : " + rt.isValidDimension());
		System.out.println("Area : " + rt.area());
		System.out.println("Perimeter : " + rt.perimeter());
	}
}
