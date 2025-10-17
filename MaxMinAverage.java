import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = Integer.MIN_VALUE; // Start very low
        int min = Integer.MAX_VALUE; // Start very high
        int sum = 0; // To store total

        // Ask for 10 numbers
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = input.nextInt();
            sum += num;

            if (num > max) max = num; // Update max
            if (num < min) min = num; // Update min
        }

        double average = sum / 10.0; // Calculate average
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Average: " + average);

        input.close();
    }
}
