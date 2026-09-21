import java.util.Scanner;

/**
 * Machine Problem 3
 * Returns the reversed version of the input string.
 */
public class MP3_ReverseString {

    // Returns 'input' reversed.
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Machine Problem 3: reverseString(String input) ===\n");

        String[] testValues = {"Java", "Codespaces", "12345", "A"};

        for (String s : testValues) {
            System.out.println("\"" + s + "\" -> \"" + reverseString(s) + "\"");
        }

        System.out.print("\nEnter a string to reverse: ");
        String userInput = sc.nextLine();
        System.out.println("Reversed: \"" + reverseString(userInput) + "\"");

        sc.close();
    }
}
