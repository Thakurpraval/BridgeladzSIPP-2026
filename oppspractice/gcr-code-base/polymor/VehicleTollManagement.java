class Vehicle {

    String vehicleNumber;
    String ownerName;

    Vehicle(String vehicleNumber, String ownerName) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
    }

    double calculateToll() {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 100;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 250;
    }
}

class Truck extends Vehicle {

    Truck(String vehicleNumber, String ownerName) {
        super(vehicleNumber, ownerName);
    }

    @Override
    double calculateToll() {
        return 400;
    }
}

public class VehicleTollManagement {

    static void calculateTotalRevenue(Vehicle[] vehicles) {

        double total = 0;

        for (Vehicle v : vehicles)
            total += v.calculateToll();

        System.out.println("Total Revenue = ₹" + total);
    }

    static void searchVehicle(Vehicle[] vehicles, String number) {

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equals(number)) {

                System.out.println("Vehicle Found");
                System.out.println("Owner : " + v.ownerName);
                return;
            }
        }

        System.out.println("Vehicle Not Found");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {

                new Car("UP32AA1010", "Rahul"),
                new Bus("UP32BB2020", "Amit"),
                new Truck("UP32CC3030", "Priya"),
                new Car("UP32DD4040", "Rohan")
        };

        int car = 0, bus = 0, truck = 0;

        Vehicle highest = vehicles[0];

        for (Vehicle v : vehicles) {

            System.out.println(v.vehicleNumber +
                    " Toll = ₹" + v.calculateToll());

            if (v.calculateToll() > highest.calculateToll())
                highest = v;

            if (v instanceof Car)
                car++;
            else if (v instanceof Bus)
                bus++;
            else
                truck++;
        }

        calculateTotalRevenue(vehicles);

        searchVehicle(vehicles, "UP32BB2020");

        System.out.println("Highest Toll Vehicle : "
                + highest.vehicleNumber);

        System.out.println("Cars : " + car);
        System.out.println("Buses : " + bus);
        System.out.println("Trucks : " + truck);
    }
}