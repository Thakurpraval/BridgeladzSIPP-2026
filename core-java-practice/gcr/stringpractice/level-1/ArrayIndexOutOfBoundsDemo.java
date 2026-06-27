import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Generate Exception
    public static void generateException(String[] names) {

        System.out.println(names[names.length]);
    }

    // Handle Exception
    public static void handleException(String[] names) {

        try {

            System.out.println(names[names.length]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled.");
            System.out.println("Message: " + e.getMessage());

        } catch (RuntimeException e) {

            System.out.println("RuntimeException Handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Size of Array: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter " + size + " Names:");

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        // generateException(names);

        handleException(names);

        sc.close();
    }
}