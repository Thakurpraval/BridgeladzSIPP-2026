public class Item {

    int itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    double totalCost(int quantity) {
        return price * quantity;
    }

    public static void main(String[] args) {
        Item item = new Item();

        item.itemCode = 101;
        item.itemName = "Pen";
        item.price = 20;

        item.displayItem();

        int quantity = 5;
        System.out.println("Total Cost: " +
                item.totalCost(quantity));
    }
}