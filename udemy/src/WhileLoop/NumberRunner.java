package WhileLoop;

import java.util.Scanner;

public class NumberRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ur number : ");
		int no = sc.nextInt();
		System.out.println("Your entered number : " + no);
		Number nb = new Number(no);
		nb.printSquaresUptoLimit();
		nb.printCubesUptoLimit();
		sc.close();
	}
}
