import java.util.Scanner;

/**
 * Machine Problem 1
 * Checks whether a given number is a prime number.
 */
public class MP1_IsPrime {

    // Returns true if 'number' is a prime number, false otherwise.
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0, 1, and negatives are not prime
        }
        if (number == 2) {
            return true; // 2 is the only even prime
        }
        if (number % 2 == 0) {
            return false; // other even numbers are not prime
        }
        // Only need to check odd divisors up to sqrt(number)
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] testValues = {2, 7, 15, 17, 1, 0, -5, 97, 100};

        System.out.println("=== Machine Problem 1: isPrime(int number) ===\n");

        for (int n : testValues) {
            System.out.println(n + " -> " + (isPrime(n) ? "Prime" : "Not Prime"));
        }

        System.out.print("\nEnter your own number to test: ");
        int userInput = sc.nextInt();
        System.out.println(userInput + " -> " + (isPrime(userInput) ? "Prime" : "Not Prime"));

        sc.close();
    }
}
