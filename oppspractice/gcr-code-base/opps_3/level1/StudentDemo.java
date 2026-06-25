class Student {

    static String universityName = "AKTU";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    String grade;

    Student(String name,
            int rollNumber,
            String grade) {

        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    void display() {
        System.out.println(
                name + " | "
                        + rollNumber + " | "
                        + grade);
    }
}

public class StudentDemo {

    public static void main(String[] args) {

        Student s =
                new Student(
                        "Praval",
                        101,
                        "A");

        if (s instanceof Student) {
            s.display();
        }

        Student.displayTotalStudents();
    }
}