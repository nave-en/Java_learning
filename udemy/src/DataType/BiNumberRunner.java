package DataType;

public class BiNumberRunner {

	public static void main(String[] args) {
		BiNumber bi = new BiNumber(10, 15);
		System.out.println("Number 1 : " + bi.getNo1());
		System.out.println("Number 2 : " + bi.getNo2());
		System.out.println("Add : " + bi.add());
		System.out.println("Multiply : " + bi.multiply());
		System.out.println("Double No 1 : " + bi.doubleNo1());
		System.out.println("Double No 2 : " + bi.doubleNo2());
	}
}
