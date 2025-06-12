// Classes and objects

// public, private -> Access modifiers
// Objects: Instance of a class


// Sample class
class Lamp{

    // Attribute
    boolean isOn;

    // Method
    void turnOn() {
        isOn = true;

        System.out.println("The light is on: " + isOn);
    }

    // Method
    void turnOff() {
        isOn =false;

        System.out.println("The light is on: " + isOn);
    }
}


public class ClassAndObject {
    public static void main(String[] args) {

        // Create an object
        Lamp lamp1 = new Lamp();

        // Access attributes and methods
        System.out.println(lamp1.isOn);

        lamp1.turnOff();
        lamp1.turnOn();




    }
}
