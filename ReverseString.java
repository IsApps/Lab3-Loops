import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create Scanner
        System.out.print("Enter a string: ");
        String text = input.nextLine(); // Read input
        String reversed = ""; // Empty string to store reversed version

        // Loop backwards through the string
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i); // Add each character in reverse
        }

        System.out.println("Reversed string: " + reversed);
        input.close();
    }
}
