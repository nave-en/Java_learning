package udemy.firstjavaproject;

public class MultiplicationTable {
	void display(int mul, int start, int end) {
		for (int val = start; val < end; val++) {
			System.out.println(mul + " * " + val + " = " + (mul * val));
			System.out.println();
		}
	}
}
