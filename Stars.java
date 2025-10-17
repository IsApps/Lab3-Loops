public class Main {
    public static void main(String[] args) {
        // Outer loop controls rows
        for (int i = 1; i <= 7; i++) {
            // Inner loop prints stars in each row
            for (int j = 1; j <= 7; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line
        }
    }
}
