// Date: 01-03-2025
// Description: Variables in Java

// Variables are containers to store a value

// Variables types in Java:
// String -> Text
// Int -> Integers
// Float -> Decimals
// Char -> Single characters (Use single quotes)
// Boolean -> tue or false


import java.text.MessageFormat;

public class Variables {
    public static void main(String[] args) {

        // String
        String name = "john";
        System.out.printf("Your name is %s%n", name);

        // Int
        int age = 22;
        System.out.printf("You are %d years old%n", age);

        float gpa = 5.3f;
        double gpa2 = 3.4;
        char letter = 'C';



        // Create a variable and then assign a value
        boolean isOnline;
        isOnline = true;
        System.out.printf("Earth is a blue planet: %b%n", isOnline);

        // Final variables: Can't be changes and read only
        // final or constant variables
        final int number = 12;
        System.out.printf("The number is %s%n", number);

        // Area of a rectangle
        int length = 4;
        int width = 6;
        int area = length * width;

        System.out.printf("Area of the triangle: %d%n", area);



    }
}

