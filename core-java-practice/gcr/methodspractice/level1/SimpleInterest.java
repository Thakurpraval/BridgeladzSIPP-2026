import java.util.Scanner;

public class SimpleInterest {

    // Method to calculate Simple Interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        System.out.println("\nThe Simple Interest is " + simpleInterest);
        System.out.println("Principal = " + principal);
        System.out.println("Rate = " + rate + "%");
        System.out.println("Time = " + time + " years");

        sc.close();
    }
}