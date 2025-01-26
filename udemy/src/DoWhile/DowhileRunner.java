package DoWhile;

import java.util.Scanner;

public class DowhileRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		do {
			System.out.println("Enter your number");
			no = sc.nextInt();
			if (no < 0) {
				break;
			}
			System.out.println("Your Entered Number : " + no);
			System.out.println("Cube of the number : " + (no * no * no));
		} while (no >= 0);
	}
}
