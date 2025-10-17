import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner to take user input
        String password = ""; // Start with an empty password

        // Keep asking until user types "JavaRocks"
        while (!password.equals("JavaRocks")) {
            System.out.print("Enter password: ");
            password = input.nextLine(); // Read input
        }

        System.out.println("Access Granted!"); // When correct password is entered
        input.close(); // Close Scanner
    }
}
