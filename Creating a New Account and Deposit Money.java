public class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " rupees. New balance: " + balance + " rupees.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " rupees. Remaining balance: " + balance + " rupees.");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a new account
        System.out.println("Enter your name to create a new account:");
        String name = scanner.nextLine();
        System.out.println("Enter initial deposit amount:");
        double initialDeposit = scanner.nextDouble();

        BankAccount account = new BankAccount(name, initialDeposit);
        System.out.println("Account created for " + account.getAccountHolderName() + " with initial balance of " + account.getBalance() + " rupees.");

        // Deposit money
        System.out.println("Enter amount to deposit:");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // Withdraw money
        System.out.println("Enter amount to withdraw:");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        // Display final balance
        System.out.println("Final balance for " + account.getAccountHolderName() + " is " + account.getBalance() + " rupees.");

        scanner.close();
    }
}
