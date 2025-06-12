// Java super keyword

/*
* Super keyword
* Used in subclasses to access superclass members (Attributes, Constructors and Methods)
*
* Uses:
* 1. Call methods of the superclass that are overridden in the subclass
* 2. Access attributes of the superclass
* 3. Call the superclass constructor from the subclass constructor (It must be the first Statement)
* */


// Superclass
class AnimalSuper {

    // Superclass attribute
    protected String type = "Animal";

    // Superclass constructor
    AnimalSuper() {
        System.out.println("I am the animal constructor");
    }

    // Parameterized superclass constructor
    AnimalSuper(String type) {
        System.out.println("Type: " + type);
    }

    // Method
    public void display() {
        System.out.println("I am an animal");
    }
}

class DogSub extends AnimalSuper {

    // Subclass attribute
    public String type = "Mammal";

    // Call the superclass constructor (It must be the first Statement)
    DogSub() {
        super(); // Calling superclass constructor (First Statement)

        System.out.println("I am the dog constructor");
    }

    // Call superclass parameterized constructor
    // Name() {
    //     super("Animal");
    // }

    // Override method
    @Override
    public void display() {

        // Call superclass method
        super.display();

        // Use superclass attribute
        System.out.println("I am a " + type);
        System.out.println("I am a big " + super.type);

        System.out.println("I like dog food");

    }
}


public class Super {
    public static void main(String[] args) {

        // Create an object
        DogSub obj = new DogSub();

        // Call the object method
        obj.display();
    }
}
