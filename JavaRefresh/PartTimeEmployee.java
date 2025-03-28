public class PartTimeEmployee extends Employee {
    private int salaryPerHour;
    public PartTimeEmployee(String name, int age, int workingDays, int salary) {
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
        this.salaryPerHour = 500;
    }

    public void display() {
        System.out.println("Part Time Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Salary: " + workingDays * salaryPerHour);
        System.out.println("**************************");
    }
}
