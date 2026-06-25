import java.util.Scanner;

public class DigitFrequency {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        String number = sc.next();

        int[] frequency = new int[10];

        for (int i = 0; i < number.length(); i++) {

            int digit = number.charAt(i) - '0';
            frequency[digit]++;
        }

        System.out.println("Digit Frequencies:");

        for (int i = 0; i < 10; i++) {

            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }

        sc.close();
    }
}