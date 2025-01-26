package Inheritance;

public class EmployeeRunner {

	public static void main(String[] args) {
		Employee emp = new Employee("Naveen", "12345", "nav@gamil.com", "SDE-2", "Uber", "A+", 150000);
		System.out.println("Employee Details ");
		System.out.println(emp.toString());
	}

}
