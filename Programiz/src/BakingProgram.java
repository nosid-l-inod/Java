// This is a simple banking program


import java.util.Scanner;


public class BakingProgram {

    // Show Balance
    public static void showBalance(double balance) {
        System.out.printf("Current Balance: %f", balance);
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double balance = 10.99;
        boolean isRunning = true;
        int choice;

        while (isRunning) {

            // Menu
            System.out.println("***************");
            System.out.println("Banking Program");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("Exit");

            // Choice
            System.out.print("Enter a choice (1-4): ");
            choice = input.nextInt();

            // Actions
            switch (choice) {
                case 1:
                    showBalance(balance);
                    break;
                case 2:
                    System.out.println("Deposit");
                    break;
                case 3:
                    System.out.println("Withdraw");
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }

        input.close();
    }


}
