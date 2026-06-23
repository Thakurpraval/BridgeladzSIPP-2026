class FeeDiscount {
    public static void main(String[] args) {
        double fee = 125000;
        double discount = fee * 10 / 100;

        System.out.println("The discount amount is INR " +
                discount + " and final discounted fee is INR " +
                (fee - discount));
    }
}