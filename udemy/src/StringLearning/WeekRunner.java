package StringLearning;

public class WeekRunner {
	public static void main(String[] args) {
		String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int maxLen = -1;
		String result = "";
		for (String day : days) {
			int len = day.length();
			if (len > maxLen) {
				maxLen = len;
				result = day;
			}
		}

		System.out.println("Days with most letters : " + result);

		System.out.println("Print days with most letters");

		for (int ind = days.length - 1; ind >= 0; ind--) {
			System.out.println(days[ind]);
		}
	}
}
