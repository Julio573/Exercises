package ex16;

public class Account {

    private int number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account() {
    }

    public Account(int number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void withdraw(double amount) {
        if (getBalance() < amount) {
            throw new NotEnoughBalanceException("Withdraw error: Not enough balance");
        }

        if (amount > getWithdrawLimit()) {
            throw new WithdrawExceedsLimitsException("Withdraw error: The amount exceeds withdraw limit");
        }
        this.balance -= amount;
        System.out.printf("New Balance: $%.2f%n", getBalance());
    }

}
