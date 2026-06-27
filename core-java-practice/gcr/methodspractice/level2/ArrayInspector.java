import java.util.Scanner;

public class ArrayInspector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Loop and perform check validations
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is: ");
            if (isPositive(numbers[i])) {
                System.out.print("Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        // Compare first and last elements
        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison (First vs Last element): ");
        if (comparison == 1) {
            System.out.println("First element is greater than the last element.");
        } else if (comparison == 0) {
            System.out.println("First element is equal to the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }

        scanner.close();
    }

    public static boolean isPositive(int num) {
        return num >= 0; // Treating 0 as positive based on standard even/odd logic
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        if (num1 == num2) return 0;
        return -1;
    }
}