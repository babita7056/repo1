//1.Bank Account System
package KeywordsAndInstanceofLevel1;

public class BankAccount {
    static String bankName = "SBI";
    String accountHolderName;
    final double accountNumber;
    double balance;
    static int totalAccounts=0;
    public BankAccount(String accountHolderName, double accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static void getTotalAccounts(){
        System.out.println("Total Accounts: " +totalAccounts);
    }
    public void diplaydetails(){
        if(this instanceof BankAccount){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
        }
    } 
    public static void main(String[]args){
        BankAccount a1=new BankAccount("A",1,10000);
        BankAccount a2=new BankAccount("B",2,20000);
        a1.diplaydetails();
        a2.diplaydetails();
        BankAccount.getTotalAccounts();
    }
}
