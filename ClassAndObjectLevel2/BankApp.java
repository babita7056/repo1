//2.Program to Simulate an ATM
package ClassAndObjectLevel2;
import java.util.Scanner;

class BankAccount {
    String accountHolder;
    double accountNumber;
    double balance;
    BankAccount(String accountHolder, double accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int number = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();
        BankAccount account = new BankAccount(name, number, balance);
        account.displayBalance();
        System.out.print("\nEnter amount to deposit: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        account.displayBalance();
        System.out.print("\nEnter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        account.displayBalance();

        sc.close();
    }
}
