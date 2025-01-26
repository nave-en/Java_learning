package DataType;

public class BiNumber {
	private int no1;
	private int no2;

	public BiNumber(int no1, int no2) {
		super();
		this.no1 = no1;
		this.no2 = no2;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no1) {
		this.no1 = no1;
	}

	public int getNo2() {
		return no2;
	}

	public void setNo2(int no2) {
		this.no2 = no2;
	}

	public int add() {
		return this.no1 + this.no2;
	}

	public int multiply() {
		return this.no1 * this.no2;
	}

	public int doubleNo1() {
		return this.no1 * 2;
	}

	public int doubleNo2() {
		return this.no2 * 2;
	}
}
