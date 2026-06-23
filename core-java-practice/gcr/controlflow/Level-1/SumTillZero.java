import java.util.Scanner;

public class SumTillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;
        double number;

        do {
            System.out.print("Enter number: ");
            number = sc.nextDouble();
            total += number;
        } while (number != 0);

        System.out.println("Sum = " + total);

        sc.close();
    }
}