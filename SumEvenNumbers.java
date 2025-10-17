// Program 4: Calculate sum of even numbers from 2 to 100
public class Main {
    public static void main(String[] args) {
        int sum = 0; // Variable to hold total

        // Loop through even numbers only
        for (int i = 2; i <= 100; i += 2) {
            sum += i; // Add each even number
        }

        System.out.println("Sum of even numbers from 2 to 100: " + sum);
    }
}
