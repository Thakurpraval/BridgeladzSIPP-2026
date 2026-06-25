class CarRental {

    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {

        customerName = "Unknown";
        carModel = "Standard";
        rentalDays = 1;
    }

    CarRental(String customerName,
              String carModel,
              int rentalDays) {

        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {

        double costPerDay = 1500;

        return rentalDays * costPerDay;
    }

    void display() {

        System.out.println("Customer: " + customerName);

        System.out.println("Car Model: " + carModel);

        System.out.println("Rental Days: " + rentalDays);

        System.out.println("Total Cost: ₹" + calculateCost());
    }
}

public class CarRentalDemo {

    public static void main(String[] args) {

        CarRental c1 = new CarRental();

        CarRental c2 =
                new CarRental(
                        "Praval",
                        "Hyundai Creta",
                        5);

        c1.display();

        System.out.println();

        c2.display();
    }
}