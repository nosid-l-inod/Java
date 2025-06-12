// Java input


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        // nextInt, nextDouble, nextLine..

        // Get input from user
        Scanner scanner = new Scanner(System.in);

        // Age
        System.out.println("Type you age: ");
        int age = scanner.nextInt();
        scanner.nextLine();  // Use this if we ask for an int and then a string


        // Name
        System.out.print("Type your name: ");
        String name = scanner.nextLine();

        // Print name and age
        System.out.printf("Hello %s, you are %d years old", name, age);


        // Close scanner object
        scanner.close();
    }
}
