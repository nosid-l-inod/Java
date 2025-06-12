// Linked list

/*
* LinkedList or Node
*
* Prev - stores an address of the previous element in the list. It is null for the first element
* Next - stores an address of the next element in the list. It is null for the last element
* Data - stores the actual data
*
* The elements in this list are connected through links (Prev and Next)
* */

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {

        // Create LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Add elements - add()
        names.add("Lara");
        names.add("Maria");
        names.add("Mariana");

        // Use index
        names.add(1, "Daniela");

        System.out.println("Linked List: " + names );

        // Access the element - get()
        String firstElement = names.get(0);
        System.out.println("First element: " + firstElement);

        // Removes an element
        String removedElement = names.remove(1);
        System.out.println("Removed named: " + removedElement);


    }
}
