package StringLearning;

public class StringExercise {
	private String str;

	public StringExercise(String str) {
		this.str = str;
	}

	public void displayCharacters() {
		for (int ind = 0; ind < this.str.length(); ind++) {
			System.out.println(this.str.charAt(ind));
		}

		for (char ch : this.str.toCharArray()) {
			System.out.println(ch);
		}
	}
}
