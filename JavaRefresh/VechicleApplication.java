public class VechicleApplication {
    public static void main(String[] args) {
        Vehicle vechicle = new CarV(100, "Red", 4, "Toyota");
        System.out.println("Class Name : " + vechicle.getClass().getName());
        System.out.println("Speed : " + vechicle.speed);
        System.out.println("Color : " + vechicle.color);
        System.out.println("Wheels : " + vechicle.wheels);
        vechicle.display();

        Vehicle bike = new Bike(50, "Blue", 2, "Triumph");
        System.out.println("Class Name : " + bike.getClass().getName());
        System.out.println("Speed : " + bike.speed);
        System.out.println("Color : " + bike.color);
        System.out.println("Wheels : " + bike.wheels);
        bike.display();
    }
}
