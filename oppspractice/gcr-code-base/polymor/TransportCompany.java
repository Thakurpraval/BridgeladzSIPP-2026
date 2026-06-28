class Vehicle {

    String vehicleName;

    Vehicle(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    double fuelCost(double km) {
        return 0;
    }
}

class Car extends Vehicle {

    Car(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(double km) {
        return km * 8;
    }
}

class Bus extends Vehicle {

    Bus(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(double km) {
        return km * 15;
    }
}

class Bike extends Vehicle {

    Bike(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(double km) {
        return km * 3;
    }
}

// New class added without changing existing classes
class ElectricCar extends Vehicle {

    ElectricCar(String vehicleName) {
        super(vehicleName);
    }

    @Override
    double fuelCost(double km) {
        return km * 2;
    }
}

public class TransportCompany {

    public static void main(String[] args) {

        Vehicle[] fleet = {
                new Car("Honda City"),
                new Bus("Volvo Bus"),
                new Bike("Royal Enfield"),
                new ElectricCar("Tesla")
        };

        double km = 100;

        for (Vehicle v : fleet) {

            System.out.println(v.vehicleName +
                    " Fuel Cost = ₹" + v.fuelCost(km));

            if (v instanceof Car) {
                System.out.println("This is a Car.");
            } else if (v instanceof Bus) {
                System.out.println("This is a Bus.");
            } else if (v instanceof Bike) {
                System.out.println("This is a Bike.");
            } else if (v instanceof ElectricCar) {
                System.out.println("This is an Electric Car.");
            }

            System.out.println();
        }
    }
}