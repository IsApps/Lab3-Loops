public class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1; // First two numbers
        System.out.print(n1 + " " + n2 + " "); // Print them first

        // Loop to calculate next numbers
        for (int i = 3; i <= 15; i++) {
            int n3 = n1 + n2; // Next number
            System.out.print(n3 + " ");
            n1 = n2; // Shift numbers
            n2 = n3;
        }
    }
}
