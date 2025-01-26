package Book;

public class Review {
	private int id;
	private String comment;
	private int rating;

	public Review(int id, String comment, int rating) {
		this.id = id;
		this.comment = comment;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	public int getRating() {
		return rating;
	}
}
