import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;
        int counter = 0;

        if (number >= 0 && power >= 0) {

            while (counter < power) {
                result = result * number;
                counter++;
            }

            System.out.println("Answer = " + result);

        } else {
            System.out.println("Enter Positive Integers");
        }

        sc.close();
    }
}