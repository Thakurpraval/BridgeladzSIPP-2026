import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Generate Exception
    public static void generateException(String text) {
        System.out.println(text.substring(5, 2));
    }

    // Handle Exception
    public static void handleException(String text) {

        try {

            System.out.println(text.substring(5, 2));

        } catch (IllegalArgumentException e) {

            System.out.println("IllegalArgumentException Handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String text = sc.next();

        // generateException(text);

        handleException(text);

        sc.close();
    }
}