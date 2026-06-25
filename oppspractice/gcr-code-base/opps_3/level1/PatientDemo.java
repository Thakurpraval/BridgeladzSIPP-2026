class Patient {

    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    String name;
    int age;
    String ailment;
    final int patientID;

    Patient(int patientID,
            String name,
            int age,
            String ailment) {

        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;

        totalPatients++;
    }

    static void getTotalPatients() {
        System.out.println(
                "Total Patients: "
                        + totalPatients);
    }

    void display() {

        System.out.println(
                patientID + " | "
                        + name + " | "
                        + age + " | "
                        + ailment);
    }
}

public class PatientDemo {

    public static void main(String[] args) {

        Patient p =
                new Patient(
                        1,
                        "Praval",
                        20,
                        "Fever");

        if (p instanceof Patient) {
            p.display();
        }

        Patient.getTotalPatients();
    }
}