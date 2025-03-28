public class HumanApplication {
    public static void main(String[] args) {
        Human human1 = new Human("Chand");
        Human human2 = new Human("Dinesh", 25);
        Human human3 = new Human("Frank", 25, "Bangalore");
        human1.display();
        human2.display();
        human3.display();
    }
}
