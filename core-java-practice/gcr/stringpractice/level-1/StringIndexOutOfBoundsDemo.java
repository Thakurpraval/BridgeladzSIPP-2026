import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Generate Exception
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length()));
    }

    // Handle Exception
    public static void handleException(String text) {

        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException Handled.");
            System.out.println("Message: " + e.getMessage());
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