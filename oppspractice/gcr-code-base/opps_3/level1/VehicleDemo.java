class Vehicle {

    static double registrationFee = 5000;

    String ownerName;
    String vehicleType;
    final String registrationNumber;

    Vehicle(String ownerName,
            String vehicleType,
            String registrationNumber) {

        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    void display() {

        System.out.println(
                ownerName + " | "
                        + vehicleType + " | "
                        + registrationNumber);
    }
}

public class VehicleDemo {

    public static void main(String[] args) {

        Vehicle v =
                new Vehicle(
                        "Praval",
                        "Car",
                        "UP81AB1234");

        if (v instanceof Vehicle) {
            v.display();
        }

        System.out.println(
                "Registration Fee: "
                        + Vehicle.registrationFee);
    }
}