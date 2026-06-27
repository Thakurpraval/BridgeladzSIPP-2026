import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int findLength(String str) {
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.next();

        int customLength = findLength(str);

        System.out.println("Custom Length = " + customLength);
        System.out.println("Built-in Length = " + str.length());

        sc.close();
    }
}