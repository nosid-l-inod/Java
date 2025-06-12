// Java deque

/*
* Deque
* Double ended queue
*
* Add and remove element from both ends of the list
* */

import java.util.Deque;
import java.util.ArrayDeque;

public class Deques {
    public static void main(String[] args) {

        // ArrayDeque deque
        Deque<String> names = new ArrayDeque<>();

        // Add elements
        names.offer("James");
        names.offerLast("Maria");
        names.offerFirst("Beatriz");

        System.out.println("ArrayDeque: " + names);

        // Access elements
        String firstElement = names.peekFirst();
        System.out.println("Removed element: " + firstElement);

        String lastElement = names.peekLast();
        System.out.println("Last element: " + lastElement);

        // Remove elements
        String removedElement = names.pollFirst();
        System.out.println("Removed first element: " + removedElement);

        String removedLast = names.pollLast();
        System.out.println("Removed last element: " + removedLast);

        System.out.println("Remaining: " + names);
    }
}
