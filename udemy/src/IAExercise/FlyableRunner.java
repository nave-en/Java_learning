package IAExercise;

public class FlyableRunner {

	public static void main(String[] args) {
		Flyable[] flyObj = { new Bird(), new Aeroplane() };
		for (Flyable obj : flyObj) {
			obj.fly();
		}
	}
}
