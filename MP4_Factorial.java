import java.util.Scanner;

/**
 * Machine Problem 4
 * Returns the factorial of a number using recursion.
 */
public class MP4_Factorial {

    // Returns n! using recursion.
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Machine Problem 4: factorial(int n) (recursive) ===\n");

        int[] testValues = {0, 1, 5, 7, 10};

        for (int n : testValues) {
            System.out.println(n + "! = " + factorial(n));
        }

        System.out.print("\nEnter a non-negative integer: ");
        int userInput = sc.nextInt();
        System.out.println(userInput + "! = " + factorial(userInput));

        sc.close();
    }
}
