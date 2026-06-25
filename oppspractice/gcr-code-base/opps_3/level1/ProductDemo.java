class Product {

    static double discount = 10;

    final int productID;
    String productName;
    double price;
    int quantity;

    Product(int productID,
            String productName,
            double price,
            int quantity) {

        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    void display() {

        double finalPrice =
                price - (price * discount / 100);

        System.out.println(
                productID + " | "
                        + productName + " | "
                        + finalPrice + " | "
                        + quantity);
    }
}

public class ProductDemo {

    public static void main(String[] args) {

        Product p =
                new Product(1,
                        "Laptop",
                        50000,
                        2);

        if (p instanceof Product) {
            p.display();
        }

        Product.updateDiscount(15);
    }
}