package ex6;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    public BankAccount() {
    }

    public BankAccount(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        this.balance -= (amount + 5);
    }

    @Override
    public String toString() {
        return "Account " +
                getAccountNumber() +
                 ", Holder: " +
                 getAccountHolder() +
                 ", balance: $ " +
                 String.format("%.2f%n", getBalance());
    }
}
