package model;

class ElectricCar extends Car {
    private int batteryLevel;

    public ElectricCar(String brand, String model, int year) {
        super(brand, model, year);
        this.batteryLevel = 100;
    }

    public void charge() {
        batteryLevel = 100;
        System.out.println("Electric car fully charged.");
    }

    @Override
    public void displayCarInfo() {
        super.displayCarInfo();
        System.out.println("Battery Level: " + batteryLevel + "%");
    }
}
