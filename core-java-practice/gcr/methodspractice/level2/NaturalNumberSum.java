import java.util.Scanner;

public class NaturalNumberSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        // Check if it's a Natural number
        if (n <= 0) {
            System.out.println("Error: Please enter a valid natural number (n > 0).");
        } else {
            int recursiveSum = sumRecursion(n);
            int formulaSum = sumFormula(n);

            System.out.println("Sum using Recursion: " + recursiveSum);
            System.out.println("Sum using Formula: " + formulaSum);

            if (recursiveSum == formulaSum) {
                System.out.println("Result: Both computations match and are correct!");
            } else {
                System.out.println("Result: Discrepancy found between the computations.");
            }
        }
        scanner.close();
    }

    // Recursive method
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursion(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }
}