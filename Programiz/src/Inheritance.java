// Java inheritance


/*
* Inheritance
* Allows to create a new class from an existing class
*
* Subclass
* Child class
*
* Superclass
* Parent class
*
* Extends keyword
* Used to perform inheritance in Java
*
* Method overriding - @Override
* When the method in the subclass overrides the method in the superclass
*
* Super keyword
* Used to call a method of superclass in subclass
* Also used to call the constructor of the superclass from constructor of the subclass
*
* Protected members
* Fields and methods that are accessible from the subclass
* */

import org.w3c.dom.ls.LSOutput;

// Parent class (Superclass)
class Animal {

    // Variable
    String name;

    // Protected string
    protected String team;

    // Method
    public void eat() {
        System.out.println("I can eat");
    }
}

// Child class (Subclass)
class Dog extends Animal {

    // New method
    public void display() {
        System.out.println("My name is " + this.name);

        // Call the method of superclass
        super.eat();
    }

    // Override the superclass method
    @Override
    public void eat() {
        System.out.println("I eat dog food");
    }
}


public class Inheritance {
    public static void main(String[] args) {

        // Create an object
        Dog labrador = new Dog();

        // Define the name
        labrador.name = "Floquito";
        labrador.display();
        labrador.eat();

        // Access protected member
        labrador.team = "Warriors";
        System.out.println(labrador.team);


    }
}
