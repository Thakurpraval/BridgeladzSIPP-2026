import java.util.Scanner;

public class ReverseNumberArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String number = sc.next();

        int[] digits = new int[number.length()];

        for (int i = 0; i < number.length(); i++) {
            digits[i] = number.charAt(i) - '0';
        }

        System.out.print("Reversed Number: ");

        for (int i = digits.length - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }

        sc.close();
    }
}