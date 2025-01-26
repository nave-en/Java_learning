package EnumLearning;

public class EnumRunner {

	enum Season {
		SUMMER, SPRING, WINTER, FALL;
	}

	public static void main(String[] args) {
		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		System.out.println(season1.ordinal());
	}
}
