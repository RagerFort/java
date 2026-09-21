import java.util.Scanner;

/**
 * Machine Problem 2
 * Returns the largest among three given integers.
 */
public class MP2_FindMax {

    // Returns the largest of a, b, and c.
    public static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Machine Problem 2: findMax(int a, int b, int c) ===\n");

        int[][] testSets = {
            {10, 25, 7},
            {-3, -8, -1},
            {5, 5, 5},
            {100, 99, 100}
        };

        for (int[] set : testSets) {
            System.out.println("findMax(" + set[0] + ", " + set[1] + ", " + set[2] + ") = "
                    + findMax(set[0], set[1], set[2]));
        }

        System.out.print("\nEnter three integers separated by space: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Largest value = " + findMax(a, b, c));

        sc.close();
    }
}
