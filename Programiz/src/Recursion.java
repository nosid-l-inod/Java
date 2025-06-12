// Java recursion


/*
* Recursive method
* A method that calls itself
* */

public class Recursion {

    // Factorial
    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {

        // Variables
        int number = 4, result;

        // Call the function
        result = factorial(number);
        System.out.println(result);
    }
}
