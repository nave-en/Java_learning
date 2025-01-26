package Fan;

public class Fan {
	// state
	private String make;
	private double radius;
	private String color;
	private boolean isOn;
	private byte speed;

	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}

	public void switchOn() {
		this.isOn = true;
		setSpeed((byte) 0);
	}

	public void switchOff() {
		this.isOn = false;
		setSpeed((byte) 0);
	}

	public void setSpeed(byte speed) {
		this.speed = speed;
	}

	public String toString() {
		return "Make : " + this.make + ", Radius : " + this.radius + ", color :  " + this.color + ", isOn : "
				+ this.isOn + ", Speed : " + this.speed;
	}
}
