// Java methods

// Methods - Block of code to perform some task

/*
* Types of methods:
*   1. User-defined Methods: User methods
*   2. Standard Library Methods: Built-in method
* */

public class JavaMethods {

    // Create method
    public int soma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Variables
        int x = 10;
        int y = 20;

        // Create object
        JavaMethods object = new JavaMethods();

        // Use object method
        int result = object.soma(x, y);
        System.out.println("Soma: " + result);

    }
}
