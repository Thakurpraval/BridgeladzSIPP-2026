import java.util.Scanner;

public class FriendMetrics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input data
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm/m) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }

        findYoungest(names, ages);
        findTallest(names, heights);

        scanner.close();
    }

    public static void findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int index = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                index = i;
            }
        }
        System.out.println("The youngest friend is " + names[index] + " with an age of " + minAge);
    }

    public static void findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        int index = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                index = i;
            }
        }
        System.out.println("The tallest friend is " + names[index] + " with a height of " + maxHeight);
    }
}