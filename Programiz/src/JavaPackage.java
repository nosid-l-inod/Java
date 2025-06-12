// Java package


/*
* Built-in package
* Existing java packages that comes with the JDK
* EX: java.lang, java.util, java.io
*
* User-defined package
* Packages created by the user
* */

// Use a built-in package
import java.util.ArrayList;

class UsingArrayList {
    public static void main(String[] args) {

        // Create an array
        ArrayList<Integer> number = new ArrayList<>(3);

        // Add elements
        number.add(10);
        number.add(20);
        number.add(10);

        // Print the arrayList
        System.out.println(number);
    }
}

public class JavaPackage {
}
