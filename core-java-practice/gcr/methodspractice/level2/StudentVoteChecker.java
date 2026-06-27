import java.util.Scanner;

public class StudentVoteChecker {

    // Validates age rules
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
        int[] studentAges = new int[10];

        // Loop to collect input and process output
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
            
            boolean canVote = checker.canStudentVote(studentAges[i]);
            if (canVote) {
                System.out.println("Result: Student " + (i + 1) + " CAN vote.");
            } else {
                System.out.println("Result: Student " + (i + 1) + " CANNOT vote.");
            }
        }
        scanner.close();
    }
}