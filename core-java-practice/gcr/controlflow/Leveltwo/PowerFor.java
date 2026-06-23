import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1;

        if (number >= 0 && power >= 0) {

            for (int i = 1; i <= power; i++) {
                result = result * number;
            }

            System.out.println("Answer = " + result);

        } else {
            System.out.println("Enter Positive Integers");
        }

        sc.close();
    }
}