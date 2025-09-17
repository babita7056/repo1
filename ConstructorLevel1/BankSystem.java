//3.Create a BankAccount class with:accountNumber (public).accountHolder (protected).balance (private).Write methods to:Access and modify balance using public methods.Create a subclass SavingsAccount to demonstrate access to accountNumber and accountHolder.
package ConstructorLevel1;
class BankAccount {
    public int accountNumber;       
    protected String accountHolder; 
    private double balance;         
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New Balance = " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining Balance = " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public void displaySavingsAccount() {
        System.out.println("Savings Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Current Balance: " + getBalance());
    }
}
public class BankSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Alice", 5000.0);
        acc1.displayAccount();
        acc1.deposit(2000);
        acc1.withdraw(1000);
        System.out.println();
        SavingsAccount sav1 = new SavingsAccount(202, "Bob", 10000.0, 4.5);
        sav1.displaySavingsAccount();
        sav1.deposit(500);
    }
}


