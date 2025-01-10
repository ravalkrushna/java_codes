// Base class: Vehicle
class Vehicle {
    int speed;

    // Constructor
    public Vehicle() {
        this.speed = 0;
    }

    // Method to speed up
    public void speedUp() {
        speed += 5;
        System.out.println("Vehicle speed increased by 5. Current speed: " + speed + " km/h");
    }
}

// Subclass: Car
class Car extends Vehicle {
    @Override
    public void speedUp() {
        speed += 20;
        System.out.println("Car speed increased by 20. Current speed: " + speed + " km/h");
    }
}

// Subclass: Bicycle
class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        speed += 2;
        System.out.println("Bicycle speed increased by 2. Current speed: " + speed + " km/h");
    }
}

// Main class to test functionality
public class TestVehicle {
    public static void main(String[] args) {
        // Vehicle instance
        Vehicle vehicle = new Vehicle();
        vehicle.speedUp();

        // Car instance
        Car car = new Car();
        car.speedUp();

        // Bicycle instance
        Bicycle bicycle = new Bicycle();
        bicycle.speedUp();
    }
}
