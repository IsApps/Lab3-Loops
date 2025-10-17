public class Main {
    public static void main(String[] args) {
        // Outer loop for each row
        for (int i = 1; i <= 10; i++) {
            // Inner loop for each column
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t"); // Print result with spacing
            }
            System.out.println(); // Move to next line
        }
    }
}
