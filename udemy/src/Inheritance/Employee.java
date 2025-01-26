package Inheritance;

public class Employee extends Person {
	private String title;
	private String employer;
	private String employeeGrade;
	private int salary;

	public Employee(String name, String phone, String email, String title, String employer, String employeeGrade,
			int salary) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.title = title;
		this.employer = employer;
		this.employeeGrade = employeeGrade;
		this.salary = salary;
	}

	public String toString() {
		return "Name : " + this.name + "\nPhone : " + this.phone + "\nEmail : " + this.email + "\nTitle : " + this.title
				+ "\nEmployer : " + this.employer + "\nEmployee Grade : " + this.employeeGrade + "\nSalary : "
				+ this.salary;
	}
}
