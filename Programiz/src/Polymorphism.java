// Java Polymorphism

/*
* Polymorphism
* It allows the same entity (method, operator, object) to perform different operations in different  scenarios
*
* We can use:
* Method overloading
*
* */


// Superclass
class Vehicle {

    // Method
    public void display() {
        System.out.println("I am a vehicle");
    }
}

// Subclass
class Mustang extends Vehicle {

    // Override the superclass method
    @Override
    public void  display() {
        System.out.println("Mustang is a dope vehicle");
    }
}

public class Polymorphism {
    public static void main(String[] args) {

        // Mustang object
        Mustang mustang = new Mustang();

        // Call object method
        mustang.display();


        // Vehicle object
        Vehicle vehicle = new Vehicle();

        // Use method
        vehicle.display();
    }
}
