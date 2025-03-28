public class Student {
    public Person p;
    private int std;
    public Student(String name, int age, int std) {
        p = new Person(name, age);
        this.std = std;
    }

    public void displayDetails() {
        System.out.println("Name : " + p.name);
        System.out.println("Age : " + p.age);
        System.out.println("Standard : " + this.std);
    }
}
