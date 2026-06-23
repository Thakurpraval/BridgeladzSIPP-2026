import java.util.Scanner;

class FeeDiscountInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fee = sc.nextDouble();
        double percent = sc.nextDouble();

        double discount = fee * percent / 100;

        System.out.println("The discount amount is INR " +
                discount + " and final discounted fee is INR " +
                (fee - discount));
    }
}