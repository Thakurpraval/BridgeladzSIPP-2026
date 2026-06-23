import java.util.Scanner;

class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double price = sc.nextDouble();
        int quantity = sc.nextInt();

        double total = price * quantity;

        System.out.println("The total purchase price is INR " +
                total + " if the quantity " +
                quantity + " and unit price is INR " + price);
    }
}