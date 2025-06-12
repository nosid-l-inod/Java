// Java constructors
// They have the same name as the class

// Constructors cannot be: abstract, static or final

/*
* Types of Constructor:
*   1. No-Arg Constructor: Takes no argument/parameter (public or private)
*   2. Parameterized Constructor: Accepts arguments
*   3. Default Constructor: Automatically created by java
* */


// ####################################

//1. No-Arg Constructor
// Public No-Arg constructor
class Company {

    // Attribute
    String name;

    public Company() {
        name = "Lebron";
    }
}

//1. No-Arg Constructor
// Private No-arg Constructor
public class Constructors {

    // Attributes
    String name;

    // Private constructors - Cannot be accessed outside the class
    // We  have to create object inside the class
    private Constructors() {
        name = "James";
    }

    // Main class
    public static void main(String[] args) {

        // Private constructor object
        // (Created inside the class)
        Constructors privateObject = new Constructors();

        // Use No-Arg constructor
        System.out.println("Private constructor attribute (No-Arg): " + privateObject.name);

        // Public constructor object
        Company publicObject = new Company();
        System.out.println("Public constructor attribute (No-Arg): " + publicObject.name);
    }
}


// #########################################


// 2. Parameterized Constructor
class Parameters {

    // Attribute
    String languages;

    // Constructor
    Parameters(String lang) {
        languages = lang;
    }

    // Main method
    public static void main(String[] args) {

        // Create objects
        Parameters object1 = new Parameters("Java");
        Parameters object2 = new Parameters("Python");

        System.out.println(object1.languages);
        System.out.println(object2.languages);
    }
}


// ########################################


// 3. Default Constructor
// Java automatically creates a constructor with some default values
class DefaultParameter {

    int x;
    boolean y;

    public static void main(String[] args) {

        // Call default constructor
        DefaultParameter object = new DefaultParameter();

        System.out.println("x: " + object.x);
        System.out.println("y: " + object.y);
    }
}