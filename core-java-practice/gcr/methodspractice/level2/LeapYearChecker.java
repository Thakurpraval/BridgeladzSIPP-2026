import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        scanner.close();
    }

    public static boolean isLeapYear(int year) {
        // Only valid for year >= 1582 (Gregorian calendar)
        if (year < 1582) {
            System.out.println("Note: Year is before 1582 (Pre-Gregorian Calendar rules do not apply here).");
            return false;
        }
        // Divisible by 4 and not divisible by 100, or divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}