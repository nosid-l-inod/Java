// Java Arrays

// Arrays are a collection of similar types data

// Import array
import java.util.Arrays;


public class Array {
    public static void main(String[] args) {

        // Declare and allocate memory
        // The array is going to store 5 elements
        String[] nomes = new String[5];
        nomes[0] = "James";

        // Access element
        System.out.println("First element: " + nomes[0]);


        // Declare and initialize
        String[] names = {"Lebron", "Steph", "Drake", "Magic"};

        // Loop the array
        System.out.println("\nArray elements: ");
        for (String name : names) {
            System.out.println(name);
        }

        // Array length
        int length = names.length;
        System.out.println("\nLength of the array: " + length);


        // Copy an array using assigning operator
        int[] numbers = {1, 2, 3, 4, 5};
        int[] numbers2 = numbers;

        for (int i : numbers2) {
            System.out.println(i);
        }


        // Copy array using loop
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[5];

        // Copy using arraycopy() method (Best method)
        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        int[] arrayX = {10, 20, 30, 40};
        int[] arrayY = new int[4];

        System.arraycopy(arrayX, 0, arrayY, 0, arrayX.length);
        System.out.println(Arrays.toString(arrayY));


        // Copy using copyOfRange() method
        // (Easy method)
        int[] main = {100, 200, 300, 400};
        int[] destination = Arrays.copyOfRange(main, 0, main.length);
        System.out.println("Copy: " + Arrays.toString(destination));



    }
}
