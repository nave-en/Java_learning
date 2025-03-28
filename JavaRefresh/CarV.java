public class CarV extends Vehicle{
    private String brand;
    public CarV(int speed, String color, int wheels, String brand) {
        super(speed, color, wheels);
        this.brand = brand;
    }
    public void display() {
        System.out.println("Speed : " + speed + " Color : " + color + " Wheels : " + wheels + " Brand : " + brand);
    }
}
