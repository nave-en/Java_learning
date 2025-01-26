package CollectionPackage;

import java.util.Comparator;

class DescendingComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s2.getId(), s1.getId());
	}

}

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return this.id;
	}

	public String toString() {
		return "Id : " + this.id + " Name : " + this.name;
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.id, that.id);
	}
}
