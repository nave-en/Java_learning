package CollectionPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> student = List.of(new Student(3, "Rose"), new Student(2, "Lilly"), new Student(1, "Star"));
		List<Student> students = new ArrayList<>(student);
		for (Student std : students) {
			System.out.println("Student Info ");
			System.out.println(std.toString());
		}

		Collections.sort(students);
		for (Student std : students) {
			System.out.println("Student Info ");
			System.out.println(std.toString());
		}

		System.out.println("Descending Order");
		Collections.sort(students, new DescendingComparator());
		for (Student std : students) {
			System.out.println("Student Info ");
			System.out.println(std.toString());
		}
	}
}
