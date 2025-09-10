class Car {
    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.speed = 0;
    }

    public void accelerate() {
        speed += 10;
        System.out.println(brand + " is accelerating. Speed: " + speed + " km/h");
    }

    public void brake() {
        speed -= 10;
        System.out.println(brand + " is braking. Speed: " + speed + " km/h");
    }
}

public class CarDemo {
    public static void main(String[] args) {
        System.out.println("This submission belongs to 12345678, Your Name");
        Car myCar = new Car("Toyota", "Red");
        myCar.accelerate();
        myCar.brake();
    }
}
