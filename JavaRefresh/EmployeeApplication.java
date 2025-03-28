public class EmployeeApplication {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new FullTimeEmployee("Karthi", 30, 20, 1500);
        fullTimeEmployee.display();
        Employee partTimeEmployee = new PartTimeEmployee("Kumar", 25, 20, 500);
        partTimeEmployee.display();
    }
}
