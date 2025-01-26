package ForLoop;

import java.util.Scanner;

public class MyNumberRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sc.nextInt();
		System.out.println("The entered Number : " + no);
		MyNumber number = new MyNumber(no);
		if (number.isPrime()) {
			System.out.println("Number : " + no + " is prime");
		} else {
			System.out.println("Number : " + no + " is not a prime");
		}
		System.out.println("Sum up to number : " + number.sumUptoN());
		System.out.println("Sum of Divisors : " + number.sumOfDivisors());
		number.printANumberTriangle();
		sc.close();
	}
}
