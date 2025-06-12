// Java Queue Interface

/*
* Queue
* First In, First Out
*
* Use it with: ArrayDeque, LinkedList, PriorityQueue
*
* */

// Import queue
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {

        // LinkedList queue
        Queue<String> names = new LinkedList<>();

        // Array queue
        Queue<String> array = new ArrayDeque<>();

        // PriorityQueue queue
        Queue<String> priority = new PriorityQueue<>();


        // Add element - offer()
        names.offer("James");
        names.offer("Kevin");
        names.offer("Stephen");

        // Access elements - peek()
        String firstElement = names.peek();
        System.out.println("Fist element: " + firstElement);

        // Remove elements - poll()
        String removedElement = names.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Updated queue: " + names);
    }
}
