package model;

public class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    // Constructor - Abstraction of setup
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    // Encapsulated getters and setters
    public String getBrand() {
        return brand;
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " is accelerating. Speed: " + speed + " km/h");
    }

    public void brake() {
        speed = Math.max(speed - 10, 0);
        System.out.println(brand + " is braking. Speed: " + speed + " km/h");
    }

    // Abstraction: To display car info nicely
    public void displayCarInfo() {
        System.out.println(this); // use toString()
    }

    @Override
    public String toString() {
        return String.format("Car Info - Brand: %s | Model: %s | Year: %d | Speed: %d km/h",
                brand, model, year, speed);
    }
}
