package OOPS;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);
		artOfComputerProgramming.setNoOfCopies(20);
		effectiveJava.setNoOfCopies(25);
		cleanCode.setNoOfCopies(30);

		artOfComputerProgramming.increaseNoOfCopies(30);
		effectiveJava.increaseNoOfCopies(30);
		cleanCode.increaseNoOfCopies(40);

		cleanCode.decreaseNoOfCopies(1);
		artOfComputerProgramming.decreaseNoOfCopies(1);
		effectiveJava.decreaseNoOfCopies(1);

		System.out.println(cleanCode.getNoOfCopies());
		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
	}
}
