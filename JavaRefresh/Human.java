public class Human {
    private String name, town;
    private int age;
    public Human(String name) {
        System.out.println("Name : " + name);
        this.name = name;
    }
    public Human(String name, int age) {
        System.out.println("Name : " + name + " Age : " + age);
        this.name = name;
        this.age = age;
    }
    public Human(String name, int age, String town) {
        System.out.println("Name : " + name + " Age : " + age + " Town : " + town);
        this.name = name;
        this.age = age;
        this.town = town;
    }

    public void display() {
        System.out.println("Name : " + name + " Age : " + age + " Town : " + town);
    }
}
