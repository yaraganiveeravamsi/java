// Base class
class Vehicle {
    String brand;
    int speed;

    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Derived class - Car
class Car extends Vehicle {
    String fuelType;

    Car(String brand, int speed, String fuelType) {
        super(brand, speed); // Correct call to parent constructor
        this.fuelType = fuelType;
    }

    @Override
    void showDetails() {
        System.out.println("Car Details:");
        super.showDetails();
        System.out.println("Fuel Type: " + fuelType);
    }
}

// Derived class - Bike
class Bike extends Vehicle {
    int engineCapacity;

    Bike(String brand, int speed, int engineCapacity) {
        super(brand, speed); // Correct call to parent constructor
        this.engineCapacity = engineCapacity;
    }

    @Override
    void showDetails() {
        System.out.println("Bike Details:");
        super.showDetails();
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
    }
}

// Main class to test the program
public class Main {
    public static void main(String[] args) {
        Car car = new Car("Honda", 160, "Diesel");
        Bike bike = new Bike("Yamaha", 120, 150);

        car.showDetails();
        System.out.println();
        bike.showDetails();
    }
}