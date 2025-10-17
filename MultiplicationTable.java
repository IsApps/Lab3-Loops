public class Main {
    public static void main(String[] args) {
        // Print header
        System.out.println("    Multiplication Table (1–12)");
        System.out.print("    ");
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%4d", i); // Print column numbers
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        // Print each row
        for (int i = 1; i <= 12; i++) {
            System.out.printf("%2d |", i); // Row label
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j); // Print product
            }
            System.out.println(); // Next row
        }
    }
}
