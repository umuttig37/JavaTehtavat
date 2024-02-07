package Moduuli10;

public class BankAccount {
    protected int moneyAmount;
    protected int balance = 0;
    protected int AccountNumber;
    protected static int totalAccount;
    public BankAccount(int Moneyamount){
        this.moneyAmount = Moneyamount;
        this.balance = Moneyamount;
        totalAccount++;
        AccountNumber = totalAccount;
    }

    protected void deposit(int amount){
        balance += amount;
    }
    protected void withdraw(int amount){
        balance -= amount;
    }
    protected int getAccountNumber(){
        return this.AccountNumber;
    }
    protected int getBalance(){
        return this.balance;
    }
    protected static int getTotalAccounts(){
        return totalAccount;
    }
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(1000);
        BankAccount account2 = new BankAccount(2000);

        account1.deposit(500);
        account2.withdraw(800);

        System.out.println("Account " + account1.getAccountNumber() + " balance: " + account1.getBalance());
        System.out.println("Account " + account2.getAccountNumber() + " balance: " + account2.getBalance());

        System.out.println("Total number of accounts: " + BankAccount.getTotalAccounts());
    }

}
