package Student;

import java.math.BigDecimal;
import java.util.ArrayList;

public class StudentArrayList {
	private ArrayList<Integer> markList;
	private String name;

	public StudentArrayList(String name) {
		this.name = name;
		markList = new ArrayList<>();
	}

	public void addMarks(int mark) {
		markList.add(mark);
	}

	public void removeMark(int mark) {
		markList.remove(Integer.valueOf(mark));
	}

	public int getNumberOfMarks() {
		return markList.size();
	}

	public int getMinimumMark() {
		int minMark = 200;
		for (int mark : markList) {
			minMark = Math.min(mark, minMark);
		}

		return minMark;
	}

	public int getMaximumMark() {
		int maxMark = -1;
		for (int mark : markList) {
			maxMark = Math.max(mark, maxMark);
		}

		return maxMark;
	}

	public int getTotalMark() {
		int totalMark = 0;
		for (int mark : markList) {
			totalMark += mark;
		}

		return totalMark;
	}

	public BigDecimal getAverageMarks() {
		int totalMark = this.getTotalMark();
		int markLen = this.getNumberOfMarks();

		return new BigDecimal(totalMark).divide(new BigDecimal(markLen));
	}
}
