class ProfitLoss {
    public static void main(String[] args) {
        int cp = 129, sp = 191;
        int profit = sp - cp;
        double percent = (profit * 100.0) / cp;

        System.out.println("The Cost Price is INR " + cp +
                "\nThe Selling Price is INR " + sp +
                "\nThe Profit is INR " + profit +
                "\nThe Profit Percentage is " + percent);
    }
}