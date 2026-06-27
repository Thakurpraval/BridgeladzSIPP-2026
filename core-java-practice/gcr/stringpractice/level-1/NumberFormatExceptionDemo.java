import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Generate Exception
    public static void generateException(String text) {

        int number = Integer.parseInt(text);

        System.out.println("Number = " + number);
    }

    // Handle Exception
    public static void handleException(String text) {

        try {

            int number = Integer.parseInt(text);

            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {

            System.out.println("NumberFormatException Handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}