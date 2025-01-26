package IAExercise;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animalObj = { new Dog(), new Cat() };
		for (Animal obj : animalObj) {
			obj.bark();
		}
	}
}
