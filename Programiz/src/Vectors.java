// Java vectors


/*
* Vector
* Implementation of the List that allow to create resizable arrays.
* It's similar to the ArrayList
*
* Vector vs ArrayList
* 1. Vector - Synchronizes each individual operation. If one thread is using the vector, others can't
* 2. ArrayList - Methods are not synchronized
*
* Use ArrayList because they are more efficient
* */


// Import vector
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {

        // Create a vector
        Vector<String> names = new Vector<>();

        // Add element - add()
        names.add("James Harden");
        names.add("Lebron James");
        names.add("Stephen Curry");

        // Add element by index
        names.add(1, "Jordan");
        System.out.println("List: " + names);

        // Add element using - addAll()
        Vector<String> dogs = new Vector<>();
        dogs.add("MJ");
        dogs.add("LBJ");
        dogs.add("SC");

        // AddAll()
        dogs.addAll(names);
        System.out.println("New vector: " + dogs);

        // Remove uses the same method
    }
}
