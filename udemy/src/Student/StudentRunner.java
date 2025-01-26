package Student;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
//		display(96, 98, 99);
//		display(96, 98, 99, 100);
//		Student std = new Student("Raj", 5);
//		std.addMarks(90);
//		std.addMarks(91);
//		std.addMarks(92);
//		std.addMarks(93);
//		std.addMarks(94);
//		int number = std.getNumberOfMarks();
//		System.out.println("Get Number of Marks : " + number);
//		int sum = std.getTotalSumOfMarks();
//		System.out.println("Total Sum : " + sum);
//		int maximumMark = std.getMaximumMark();
//		System.out.println("Maximum Mark : " + maximumMark);
//		int minimumMark = std.getMinimumMark();
//		System.out.println("Minimum Mark : " + minimumMark);
//		BigDecimal average = std.getAverageMarks();
//		System.out.println("Average : " + average);

		StudentArrayList std = new StudentArrayList("Raj");
		std.addMarks(90);
		std.addMarks(91);
		std.addMarks(92);
		std.addMarks(93);
		std.addMarks(94);
		int number = std.getNumberOfMarks();
		System.out.println("Total number of marks : " + number);
		std.removeMark(94);
		number = std.getNumberOfMarks();
		System.out.println("Total number of marks : " + number);
		int maximumMark = std.getMaximumMark();
		System.out.println("Maximum mark : " + maximumMark);
		int minimumMark = std.getMinimumMark();
		System.out.println("Minimum mark : " + minimumMark);
		int totalMark = std.getTotalMark();
		System.out.println("Total mark : " + totalMark);
		BigDecimal averageMark = std.getAverageMarks();
		System.out.println("Average mark : " + averageMark);
	}

	public static void display(int... marks) {
		System.out.println("Mark Variable size : " + marks.length);
		for (int mark : marks) {
			System.out.println("Your Mark : " + mark);
		}
	}
}
