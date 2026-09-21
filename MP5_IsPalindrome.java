import java.util.Scanner;

/**
 * Machine Problem 5
 * Checks if the given string is a palindrome.
 */
public class MP5_IsPalindrome {

    // Returns true if 'word' reads the same forwards and backwards
    // (case-insensitive, ignores spaces).
    public static boolean isPalindrome(String word) {
        String cleaned = word.replaceAll("\\s+", "").toLowerCase();
        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Machine Problem 5: isPalindrome(String word) ===\n");

        String[] testValues = {"level", "hello", "racecar", "Was it a car or a cat I saw", "Java"};

        for (String s : testValues) {
            System.out.println("\"" + s + "\" -> " + (isPalindrome(s) ? "Palindrome" : "Not a Palindrome"));
        }

        System.out.print("\nEnter a word or phrase to check: ");
        String userInput = sc.nextLine();
        System.out.println("\"" + userInput + "\" -> "
                + (isPalindrome(userInput) ? "Palindrome" : "Not a Palindrome"));

        sc.close();
    }
}
