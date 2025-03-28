public class FullTimeEmployee extends Employee {
    private int salaryPerDay;
    public FullTimeEmployee(String name, int age, int workingDays, int salary) {
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
        this.salaryPerDay = 1500;
    }

    public void display() {
        System.out.println("Full Time Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Working Days: " + workingDays);
        System.out.println("Salary: " + workingDays * salaryPerDay);
        System.out.println("**************************");
    }
    
}
