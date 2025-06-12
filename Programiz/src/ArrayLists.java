// Java ArrayList

/*
 * ArrayList
 * Class to implement Resizable-Arrays
 *
 * ArrayList vs Array
 * 1. Array - We need to declare the size before using it, and it's hard to change once declared
 * 2. ArrayList - Automatically adjust its capacity when we add or remove elements. It's dynamic.
 *
 * We cannot use primitive types to create array: Int
 * Don't: Int
 * Do: Integer, String,
 *
 * Methods
 * size(), sort(), contains(), indexOf()....
 * */


// Import ArrayList
import java.util.ArrayList;


public class ArrayLists {
    public static void main(String[] args) {

        // Create an of Strings
        ArrayList<String> names = new ArrayList<>();

        // Create array of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements: add()
        names.add("James Harder");
        names.add("Kevin durant");
        names.add("Jimmy Butler");

        System.out.println("Created ArrayList: " + names);

        // Add to specific position
        names.add(1, "Lebron James");

         // Access element: get()
        String second = names.get(1);
        System.out.println("Second element: " + second);

        // Change an element: set()
        names.set(0, "Michael Jordan");
        System.out.println("Modified list: " + names);

        // Remove element - remove()
        String removedElement =  names.remove(1);
        System.out.println("Removed element: " + removedElement);

        // Iterate the ArrayList
        for (String name : names) {
            System.out.println("Player: " + name);
        }
    }
}
