package OOPS;

public class Book {
	private int noOfCopies;

	Book(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void increaseNoOfCopies(int noOfCopies) {
		this.noOfCopies += noOfCopies;
	}

	public void decreaseNoOfCopies(int noOfCopies) {
		this.setNoOfCopies(this.noOfCopies - noOfCopies);
	}
}
