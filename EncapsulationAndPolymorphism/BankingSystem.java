//4.Banking System
package EncapsulationAndPolymorphism;
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
  
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(amount + " withdrawn. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    protected void setBalance(double balance) { this.balance = balance; }

    public abstract double calculateInterest();
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan requested: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000;  
    }
}
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; 
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan requested: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;  
    }
}
public class BankingSystem {
    public static void main(String[] args) {
    
        BankAccount savings = new SavingsAccount("SAV123", "Alice", 8000);
        BankAccount current = new CurrentAccount("CUR456", "Bob", 15000);

        BankAccount[] accounts = { savings, current };

        for (BankAccount acc : accounts) {
            System.out.println("Account: " + acc.getHolderName() + " (" + acc.getAccountNumber() + ")");
            System.out.println("Balance: " + acc.getBalance());

            double interest = acc.calculateInterest();
            System.out.println("Calculated Interest: " + interest);
            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(5000);
                System.out.println("Loan Eligible? " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("-------------------------");
        }
    }
}
