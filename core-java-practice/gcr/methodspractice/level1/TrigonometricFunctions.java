import java.util.Scanner;

public class TrigonometricFunctions {

    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Angle in Degrees: ");
        double angle = sc.nextDouble();

        double[] values = calculateTrigonometricFunctions(angle);

        System.out.printf("%nSine = %.4f%n", values[0]);
        System.out.printf("Cosine = %.4f%n", values[1]);
        System.out.printf("Tangent = %.4f%n", values[2]);

        sc.close();
    }
}