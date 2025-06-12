// Java Method Overriding


/*
* Method Overriding
* When a method of the subclass overrides a method of the superclass
*
* Overriding rules
* The superclass and the subclass must have the same method name, return type and parameter
* We cannot override methods declared as "final" and "static"
* Always override abstract methods of the superclass
*
* Super keyword in Overriding
* Use super keyword to access the methods of the superclass in the subclass
*
* Access modifiers in method overriding
* Methods in the superclass and its subclasses can have different access specifiers
* If the access specifiers in the subclasses provide larger access than the superclass
* */


// Superclass
class Animals {

    public void display() {
        System.out.println("I am an animal");
    }
}

// Subclass
class Dogs extends Animals{

    // Override display() method
    @Override
    public void display() {

        // Access method of the superclass
        super.display();

        System.out.println("I am a dog");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        // Create dogs object
        Dogs obj = new Dogs();

        // Call the method
        obj.display();
    }
}
