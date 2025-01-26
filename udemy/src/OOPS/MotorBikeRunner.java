package OOPS;

public class MotorBikeRunner {

	public static void main(String[] args) {
		MotorBike yamaha = new MotorBike(100);
		MotorBike hero = new MotorBike(100);
		yamaha.start();
		hero.start();
		yamaha.setSpeed(10);
		hero.setSpeed(40);
		yamaha.increaseSpeed(100);
		hero.increaseSpeed(50);
		System.out.println(yamaha.getSpeed());
		System.out.println(hero.getSpeed());
		yamaha.decreaseSpeed(30);
		hero.decreaseSpeed(20);
		System.out.println(yamaha.getSpeed());
		System.out.println(hero.getSpeed());
	}
}
