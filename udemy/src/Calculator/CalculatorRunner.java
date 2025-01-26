package Calculator;

import java.util.Scanner;

public class CalculatorRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no1, no2;
		System.out.println("Enter your first number : ");
		no1 = sc.nextInt();
		System.out.println("Your First number : " + no1);
		System.out.println("Enter your second number : ");
		no2 = sc.nextInt();
		System.out.println("Your Second number : " + no2);
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		System.out.println("Your choice : " + choice);
		sc.close();
		operation(choice, no1, no2);
	}

	public static void operation(int choice, int no1, int no2) {
		switch (choice) {
		case 0:
			System.out.println("Add two numbers : " + (no1 + no2));
			break;
		case 1:
			System.out.println("Substract two numnbers : " + (no1 - no2));
			break;
		case 2:
			System.out.println("Multiply two numnbers : " + (no1 * no2));
			break;
		case 3:
			System.out.println("Division two numnbers : " + (no1 / no2));
			break;
		default:
			System.out.println("Invalid Operation");
		}
	}
}
