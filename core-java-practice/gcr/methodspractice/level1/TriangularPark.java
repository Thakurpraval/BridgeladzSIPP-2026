import java.util.Scanner;

public class TriangularPark {

    // Method to calculate number of rounds
    public static double calculateRounds(double side1, double side2, double side3) {

        double perimeter = side1 + side2 + side3;

        double totalDistance = 5000; // 5 km = 5000 meters

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Side (meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter Second Side (meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter Third Side (meters): ");
        double side3 = sc.nextDouble();

        double rounds = calculateRounds(side1, side2, side3);

        System.out.printf("Rounds Required = %.2f%n", rounds);

        sc.close();
    }
}