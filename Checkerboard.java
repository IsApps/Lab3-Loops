public class Main {
    public static void main(String[] args) {
        // Loop through 8 rows
        for (int i = 1; i <= 8; i++) {
            // Loop through 8 columns
            for (int j = 1; j <= 8; j++) {
                // Alternate between X and O
                if ((i + j) % 2 == 0)
                    System.out.print("X ");
                else
                    System.out.print("O ");
            }
            System.out.println(); // Move to next line
        }
    }
}
