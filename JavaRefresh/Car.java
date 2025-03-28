public class Car {
    public String brand, model, year;
    public Car(String brand, String model, String year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}
