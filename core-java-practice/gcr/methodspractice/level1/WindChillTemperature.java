import java.util.Scanner;

public class WindChillTemperature {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {

        return 35.74
                + (0.6215 * temperature)
                - (35.75 * Math.pow(windSpeed, 0.16))
                + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature (°F): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter Wind Speed (mph): ");
        double windSpeed = sc.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.printf("Wind Chill Temperature = %.2f°F%n", windChill);

        sc.close();
    }
}