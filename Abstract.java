// Abstract class
abstract class Appliance {
    abstract void turnOn();
}

// Interface
interface Connectable {
    void connect();
}

// SmartTV class that extends Appliance and implements Connectable
class SmartTV extends Appliance implements Connectable {

    // Implement abstract method from Appliance
    @Override
    void turnOn() {
        System.out.println("SmartTV is turned on.");
    }

    // Implement method from Connectable interface
    @Override
    public void connect() {
        System.out.println("SmartTV is connected to the internet.");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating SmartTV object
        SmartTV tv = new SmartTV();

        // Calling methods
        tv.turnOn();
        tv.connect();
    }
}