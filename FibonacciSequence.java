public class FibonacciSequence {
    public static void main(String[] args) {
        int n1 = 0; // first number
        int n2 = 1; // second number
        int n3;     // next number

        // Print the first two numbers
        System.out.println(n1);
        System.out.println(n2);

        // Loop to generate the next 13 numbers (total 15)
        for (int i = 3; i <= 15; i++) {
            n3 = n1 + n2; // add the last two numbers
            System.out.println(n3);
            n1 = n2; // move n2 to n1
            n2 = n3; // move n3 to n2
        }
    }
}
