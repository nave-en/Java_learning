package ForLoop;

public class MyNumber {
	private int no;

	public MyNumber(int no) {
		this.no = no;
	}

	public boolean isPrime() {
		if (this.no <= 1) {
			return false;
		}
		if (this.no <= 3) {
			return true;
		}
		int high = (int) Math.ceil(Math.sqrt(this.no));
		for (int div = 2; div <= high; div++) {
			if (this.no % div == 0) {
				return false;
			}
		}

		return true;
	}

	public int sumUptoN() {
		int total = 1;
		for (int i = 1; i <= this.no; i++) {
			total += i;
		}

		return total;
	}

	public int sumOfDivisors() {
		int total = 0;
		for (int i = 1; i <= this.no; i++) {
			if (this.no % i == 0) {
				total += i;
			}
		}

		return total;
	}

	public void printANumberTriangle() {
		for (int row_ind = 1; row_ind <= this.no; row_ind++) {
			for (int no = 1; no <= row_ind; no++) {
				System.out.print(no + " ");
			}
			System.out.println();
		}
	}
}
