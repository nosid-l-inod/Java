// Ternary Operator

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        // Ternary operator - can be used to replace if..else

        Scanner scanner = new Scanner(System.in);

        System.out.print("Type your mark: ");
        int mark = scanner.nextInt();

        // Ternary operator
        String check = (mark < 9) ? "Failed" : "Pass";

        System.out.println(check);
    }
}

