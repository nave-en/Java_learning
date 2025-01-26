package Book;

public class BookRunner {

	public static void main(String[] args) {
		Book book = new Book(1, "Yoga", "Me");
		book.addReview(new Review(1, "Good", 4));
		book.addReview(new Review(1, "Great", 5));
		book.display();
	}

}
