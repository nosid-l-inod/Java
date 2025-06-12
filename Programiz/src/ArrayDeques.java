// Array deque

/*
* Array deque
* Implement queue and deque using arrays
* */

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeques {
    public static void main(String[] args) {

        // Create ArrayDeque
        ArrayDeque<String> animals = new ArrayDeque<>();

        // Adding elements
        animals.add("Dog");

        // AddFirst()
        animals.addFirst("Cat");

        // AddLast()
        animals.addLast("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Using offer()
        animals.offer("Dog");

        // Using offerFirst()
        animals.offerFirst("Cat");

        // Using offerLast()
        animals.offerLast("Horse");
        System.out.println("ArrayDeque: " + animals);

        // Get the first element
        String firstElement = animals.getFirst();
        System.out.println("First Element: " + firstElement);

        // Get the last element
        String lastElement = animals.getLast();
        System.out.println("Last Element: " + lastElement);

        // Using peek()
        String element = animals.peek();
        System.out.println("Head Element: " + element);

        // Using peekFirst()
        String firstElement1 = animals.peekFirst();
        System.out.println("First Element: " + firstElement1);

        // Using peekLast
        String lastElement1 = animals.peekLast();
        System.out.println("Last Element: " + lastElement1);

        // Using remove()
        String element1 = animals.remove();
        System.out.println("Removed Element: " + element1);

        System.out.println("New ArrayDeque: " + animals);

        // Using removeFirst()
        String firstElement2 = animals.removeFirst();
        System.out.println("Removed First Element: " + firstElement2);

        // Using removeLast()
        String lastElement2 = animals.removeLast();
        System.out.println("Removed Last Element: " + lastElement2);

        System.out.println(animals);

        /*
        * Iterator
        * Used to iterate a deque
        * */
        Iterator<String> iterate = animals.iterator();

        while(iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        }

        System.out.print("\nArrayDeque in reverse order: ");
        // Using descendingIterator()
        Iterator<String> desIterate = animals.descendingIterator();
        while(desIterate.hasNext()) {
            System.out.print(desIterate.next());
            System.out.print(", ");
        }
    }
}
