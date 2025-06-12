// Java static keyword



/*
 * Static Keyword:
 * Allow to access class members without creating instance of the class
 *
 * Static variables and methods
 * Are public by default
 *
 * Static methods:
 * Belongs to the class and not to the object of a class
 *
 * Static variables
 * Allow all the objects of the class to share the same variable
 * Static variable - Rarely used
 * Static constant - More used (Define a constant: static final)
 *
 * Static variables and Methods within the class
 * Within the class we can access the variables and the methods directly
 *
 * Static blocks
 * Used to initialize static variables
* */


class Test {

    // Non-static method
    int sum(int a, int b) {
        return a + b;
    }

    // Non-Static variable
    int min = 20;


    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }

    // Static variable
    static int max = 10;

    static int age;


    // Static blocks


}

public class StaticKeyword {

    // Static variable within the class
    static int age;


    public static void main(String[] args) {

        // Use the Non-static method
        Test test = new Test();
        System.out.println(test.sum(10, 20));

        // Use Non-static variable
        System.out.println(test.min);


        // Use the static method
        System.out.println(Test.multiply(102, 12));

        // Use static variable
        System.out.println(Test.max);

        // Use inner static variable
        age = 20;
        System.out.println(age);
    }
}

class Static {

    // static variables
    static int a = 23;
    static int b;
    static int max;

    // static blocks
    static {
        System.out.println("First Static block.");
        b = a * 4;
    }
    static {
        System.out.println("Second Static block.");
        max = 30;
    }

    // static method
    static void display() {

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("max = " + max);
    }

    public static void main(String args[]) {
        // calling the static method
        display();
    }



}

