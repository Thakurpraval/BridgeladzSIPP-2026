import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);

        System.out.println("Maximum Possible Handshakes = " + handshakes);

        sc.close();
    }
}