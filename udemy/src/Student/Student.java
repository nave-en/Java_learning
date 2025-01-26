package Student;

import java.math.BigDecimal;

public class Student {
	private String name;
	private int[] marks;
	private int startIndex;

	public Student(String name, int markLen) {
		this.name = name;
		marks = new int[markLen];
		startIndex = 0;
	}

	public void addMarks(int mark) {
		marks[startIndex++] = mark;
	}

	public int getNumberOfMarks() {
		return marks.length;
	}

	public int getTotalSumOfMarks() {
		int total = 0;
		for (int mark : marks) {
			total += mark;
		}

		return total;
	}

	public int getMinimumMark() {
		if (marks.length == 0) {
			return 0;
		}
		int min_ele = marks[0];
		for (int ind = 1; ind < marks.length; ind++) {
			if (min_ele > marks[ind]) {
				min_ele = marks[ind];
			}
		}

		return min_ele;
	}

	public int getMaximumMark() {
		if (marks.length == 0) {
			return 0;
		}
		int max_ele = marks[0];
		for (int ind = 1; ind < marks.length; ind++) {
			if (max_ele < marks[ind]) {
				max_ele = marks[ind];
			}
		}

		return max_ele;
	}

	public BigDecimal getAverageMarks() {
		int totalMarks = this.getTotalSumOfMarks();
		int markLen = this.getNumberOfMarks();

		return new BigDecimal(totalMarks).divide(new BigDecimal(markLen));
	}
}
