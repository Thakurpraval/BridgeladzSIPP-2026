import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int physics = sc.nextInt();

        System.out.print("Enter Chemistry marks: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter Maths marks: ");
        int maths = sc.nextInt();

        double percentage =
                (physics + chemistry + maths) / 3.0;

        System.out.println("Percentage = " + percentage);

        if (percentage >= 90) {
            System.out.println("Grade A");
            System.out.println("Excellent");
        } else if (percentage >= 75) {
            System.out.println("Grade B");
            System.out.println("Very Good");
        } else if (percentage >= 60) {
            System.out.println("Grade C");
            System.out.println("Good");
        } else if (percentage >= 40) {
            System.out.println("Grade D");
            System.out.println("Pass");
        } else {
            System.out.println("Grade F");
            System.out.println("Fail");
        }

        sc.close();
    }
}