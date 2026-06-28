import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionExample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter First Number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter Second Number: ");
            int num2 = sc.nextInt();

            int result = num1 / num2;

            System.out.println("Division = " + result);

        }

        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }

        catch (InputMismatchException e) {
            System.out.println("Please enter numeric values only.");
        }

        sc.close();
    }
}