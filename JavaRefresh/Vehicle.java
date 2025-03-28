public class Vehicle {
    protected String color;
    protected int speed, wheels;
    public Vehicle(int speed, String color, int wheels) {
        this.speed = speed;
        this.color = color;
        this.wheels = wheels;
    }

    public void display() {
        System.out.println("Speed : " + speed + " Color : " + color + " Wheels : " + wheels);
    }
}
