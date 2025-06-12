// Java instanceof operator


/*
* Instanceof
* Operator to check whether an object is an instance of a class
*
* In Java, String is a class (What the actual fuck :()
* */

public class Instanceof {
    public static void main(String[] args) {

        // Create a string
        String name = "Lebron";

        // Check if name is instance of String
        boolean result = name instanceof String;
        System.out.println(result);
    }
}
