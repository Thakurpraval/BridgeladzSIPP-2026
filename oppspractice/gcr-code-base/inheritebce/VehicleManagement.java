class Vehicle {

    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {

        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    void display() {

        System.out.println("Model : " + model);
        System.out.println("Max Speed : " + maxSpeed);
    }
}

interface Refuelable {

    void refuel();
}

class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model,
                    int maxSpeed) {

        super(model, maxSpeed);
    }

    void charge() {

        System.out.println("Charging vehicle...");
    }
}

class PetrolVehicle extends Vehicle
        implements Refuelable {

    PetrolVehicle(String model,
                  int maxSpeed) {

        super(model, maxSpeed);
    }

    @Override
    public void refuel() {

        System.out.println("Refueling petrol vehicle...");
    }
}

public class VehicleManagement {

    public static void main(String[] args) {

        ElectricVehicle ev =
                new ElectricVehicle("Tesla Model 3", 250);

        PetrolVehicle pv =
                new PetrolVehicle("Honda City", 180);

        System.out.println("Electric Vehicle");

        ev.display();

        ev.charge();

        System.out.println();

        System.out.println("Petrol Vehicle");

        pv.display();

        pv.refuel();
    }
}