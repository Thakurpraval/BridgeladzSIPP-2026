public class CartItem {

    String itemName;
    double price;
    int quantity;

    void addItem(String name,
                 double itemPrice,
                 int qty) {

        itemName = name;
        price = itemPrice;
        quantity = qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Not enough items.");
        }
    }

    void displayTotalCost() {
        double total = price * quantity;

        System.out.println("Item Name: " +
                itemName);
        System.out.println("Quantity: " +
                quantity);
        System.out.println("Total Cost: " +
                total);
    }

    public static void main(String[] args) {
        CartItem cart =
                new CartItem();

        cart.addItem(
                "Laptop",
                50000,
                2);

        cart.displayTotalCost();

        cart.removeItem(1);

        cart.displayTotalCost();
    }
}