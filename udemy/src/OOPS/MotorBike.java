package OOPS;

public class MotorBike {
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int speed) {
		if (speed > 0) {
			this.speed += speed;
		}
	}

	public void decreaseSpeed(int speed) {
		setSpeed(this.speed - speed);
	}

	public int getSpeed() {
		return speed;
	}

	public void start() {
		System.out.println("Bike Started");
	}

	public void stop() {

	}

}
