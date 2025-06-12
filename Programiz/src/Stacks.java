// Java stacks

/*
* Stack
* First In Last Out
*
* The first element we add has the last index
*
* Recommended not to use, use ArrayDequeue instead
* */

// Import stack
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // Create a stack
        Stack<String> names = new Stack<>();

        // Add elements - push()
        names.push("Michael Jordan");
        names.push("Lebron James");
        names.push("Stephen Curry");

        System.out.println("Created stack: " + names);

        // Remove first element - pop()
        String removedElement = names.pop();
        System.out.println("Removed element: " + removedElement);

        // Access first element - peek()
        String firstElement = names.peek();
        System.out.println("First element: " + firstElement);

        // Access element position
        int position = names.search("Michael Jordan");
        System.out.println("Michael Jordan position: " + position);

        // Check if empty - empty()
        boolean result = names.empty();
        System.out.println("Names is empty: " + result);
    }
}
