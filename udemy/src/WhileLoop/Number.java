package WhileLoop;

public class Number {
	private int no;

	public Number(int no) {
		this.no = no;
	}

	public void printSquaresUptoLimit() {
		int ind = 1;
		while (ind <= this.no) {
			int square = ind * ind;
			System.out.println("Square of " + ind + " : " + square);
			ind += 1;
		}
	}

	public void printCubesUptoLimit() {
		int ind = 1;
		while (ind <= this.no) {
			int cube = ind * ind * ind;
			System.out.println("Cube of " + ind + " : " + cube);
			ind += 1;
		}
	}
}
