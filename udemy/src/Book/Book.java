package Book;

import java.util.ArrayList;

public class Book {
	private int id;
	private String name;
	private String author;
	private ArrayList<Review> reviews = new ArrayList<>();

	public Book(int id, String name, String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public void addReview(Review review) {
		reviews.add(review);
	}

	public void display() {
		System.out.println("Book ID: " + id);
		System.out.println("Book Name: " + name);
		System.out.println("Author: " + author);
		System.out.println("Reviews:");
		for (Review review : reviews) {
			System.out.println("  Book ID: " + review.getId());
			System.out.println("  Comment: " + review.getComment());
			System.out.println("  Rating: " + review.getRating());
			System.out.println();
		}
	}
}
