import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner
        int choice; // Variable to store user’s menu choice

        do {
            // Display menu
            System.out.println("1) Say Hello");
            System.out.println("2) Say Goodbye");
            System.out.println("3) Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt(); // Read user input

            // Check what user chose
            if (choice == 1) {
                System.out.println("Hello!");
            } else if (choice == 2) {
                System.out.println("Goodbye!");
            }
        } while (choice != 3); // Repeat until user enters 3

        System.out.println("Program ended.");
        input.close();
    }
}
