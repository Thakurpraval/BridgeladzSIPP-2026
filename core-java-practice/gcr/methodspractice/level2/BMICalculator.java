import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 10 rows, 3 columns: [0]=Weight(kg), [1]=Height(cm), [2]=BMI
        double[][] metrics = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter data for person " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            metrics[i][0] = scanner.nextDouble();
            System.out.print("Height (in cm): ");
            metrics[i][1] = scanner.nextDouble();
        }

        calculateBMI(metrics);
        String[] statuses = determineStatus(metrics);

        // Display results
        System.out.println("\n--- BMI Evaluation Dashboard ---");
        System.out.printf("%-10s %-12s %-12s %-8s %-15s\n", "Person", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10d %-12.2f %-12.2f %-8.2f %-15s\n", 
                (i + 1), metrics[i][0], metrics[i][1], metrics[i][2], statuses[i]);
        }
        scanner.close();
    }

    public static void calculateBMI(double[][] metrics) {
        for (int i = 0; i < metrics.length; i++) {
            double weight = metrics[i][0];
            double heightInMeter = metrics[i][1] / 100.0; // convert cm to m
            metrics[i][2] = weight / Math.pow(heightInMeter, 2);
        }
    }

    public static String[] determineStatus(double[][] metrics) {
        String[] status = new String[metrics.length];
        // Implements standard medical BMI index break thresholds
        for (int i = 0; i < metrics.length; i++) {
            double bmi = metrics[i][2];
            if (bmi < 18.5) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal weight";
            } else if (bmi >= 24.9 && bmi < 29.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}