class BankAccount {

    static String bankName = "State Bank of India";
    static int totalAccounts = 0;

    String accountHolderName;
    final int accountNumber;

    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("Praval", 101);
        BankAccount acc2 = new BankAccount("Rahul", 102);

        if (acc1 instanceof BankAccount) {
            acc1.display();
        }

        BankAccount.getTotalAccounts();
    }
}