// Java list

/*
 * List is an interface and we cannot create objects from it
 *
 * We have to use its functionalities through these classes: ArrayList, LinkedList, Vector, Stack
 *
 * Methods of list
 *
 * Lists vs Sets
 * Lists can contain duplicated elements but Sets cannot
 * Lists stores elements in some order, while sets stores elements in groups like sets
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        // ArrayList class
        List<String> arrayList = new ArrayList<>();

        // Add elements to ArrayList - add()
        arrayList.add("Michael Jordan");
        arrayList.add("Lebron James");
        arrayList.add("Stephen Curry");

        // Display the list
        System.out.println("ArrayList: " + arrayList);

        // Access an element - get()
        String firstElement = arrayList.get(0);
        System.out.println("First element: " + firstElement);

        // Remove element
        String removedElement = arrayList.remove(1);
        System.out.println("Removed element: " + removedElement);
        System.out.println("Updated list: " + arrayList);


        // LinkedList class
        List<Integer> numbers = new LinkedList<>();

        // Add elements
        numbers.add(1);
        numbers.add(10);
        numbers.add(32);

        // Access element
        int secondElement = numbers.get(1);
        System.out.println("Second element: " + secondElement);

        // IndexOf() method
        int index = numbers.indexOf(10);
        System.out.println("Index of 10: " + index);

        // Remove elements
        int removedNumber = numbers.remove(1); // remove() uses the element index
        System.out.println("Removed number: " + removedNumber);
    }
}
