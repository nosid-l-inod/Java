// Java encapsulation

/*
* Encapsulation
* Group fields and methods inside a single class
* 1. It prevents outer classes for accessing and changing fields and methods of a class
* 2. This helps to achieve data hiding
*
* Data hiding
* Hide the data from outer classes (Use "private" keyword)
* */

class Person {

    // Attributes
    private int age;
    private String name;

    // Set name
    public void setName(String name) {
        this.name = name;
    }

    // Set age
    public void setAge(int age) {
        this.age = age;
    }

    // Get name
    public String getName() {
        return this.name;
    }

    // Get age
    public int getAge() {
        return this.age;
    }

    public static void main(String[] args) {
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        // Create object
        Person person = new Person();

        // Set age and name
        person.setName("James");
        person.setAge(20);

        // Access age with getAge()
        System.out.println("My name is " + person.getName() + " i am " + person.getAge());
    }
}
