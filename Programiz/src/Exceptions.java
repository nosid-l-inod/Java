// Java exceptions

/*
* Exception handling
* Use try...catch block
* finally block
* throw and throws keyword
*
* throw - Used to throw a single exception
* */

public class Exceptions {
    public static void main(String[] args) {

        // Exception handling try...catch
        try {
            int division = 5 / 0;
            System.out.println("Whatever");
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }

        // The finally block is always executed
        finally {
            System.out.println("This is the finally block");
        }
    }
}
