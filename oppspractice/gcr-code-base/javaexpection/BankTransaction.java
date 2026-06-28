import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {

    double balance = 10000;

    void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount < 0) {

            throw new IllegalArgumentException("Invalid amount!");

        }

        if (amount > balance) {

            throw new InsufficientBalanceException("Insufficient balance!");

        }

        balance = balance - amount;

        System.out.println("Withdrawal successful.");
        System.out.println("New Balance = " + balance);
    }

}

public class BankTransaction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BankAccount account = new BankAccount();

        System.out.print("Enter Withdrawal Amount: ");
        double amount = sc.nextDouble();

        try {

            account.withdraw(amount);

        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage());

        }

        sc.close();
    }
}