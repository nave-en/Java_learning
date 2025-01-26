package Fan;

public class FanRunner {

	public static void main(String[] args) {
		Fan fan = new Fan("Bajaj", 2.0, "White");
		System.out.println(fan.toString());
		fan.switchOn();
		System.out.println(fan.toString());
		fan.setSpeed((byte) 5);
		System.out.println(fan.toString());
		fan.switchOff();
		System.out.println(fan.toString());
	}
}
