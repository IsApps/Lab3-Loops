import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random(); // Random number generator
        int die1, die2; // Two dice

        // Keep rolling until both dice show the same number
        do {
            die1 = rand.nextInt(6) + 1; // Random number 1–6
            die2 = rand.nextInt(6) + 1; // Random number 1–6
            System.out.println("Roll: " + die1 + " and " + die2);
        } while (die1 != die2);

        System.out.println("Doubles! Both are " + die1);
    }
}
