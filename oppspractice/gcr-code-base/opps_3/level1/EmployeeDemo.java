class Employee {

    static String companyName = "TCS";
    static int totalEmployees = 0;

    String name;
    final int id;
    String designation;

    Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    void display() {
        System.out.println(name + " | " + id + " | " + designation);
    }
}

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee e1 =
                new Employee("Praval", 1001, "Developer");

        if (e1 instanceof Employee) {
            e1.display();
        }

        Employee.displayTotalEmployees();
    }
}