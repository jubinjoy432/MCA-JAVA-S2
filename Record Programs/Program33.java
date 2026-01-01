class BankAccount {
    int balance = 1000; // Initial balance

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ", Current Balance: " + balance);
    }

    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Current Balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal of: " + amount);
        }
    }
}

class DepositThread extends Thread {
    BankAccount account;
    int amount;

    public DepositThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.deposit(amount);
    }
}

class WithdrawThread extends Thread {
    BankAccount account;
    int amount;

    public WithdrawThread(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(amount);
    }
}

public class Program33 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        DepositThread deposit1 = new DepositThread(account, 500);
        WithdrawThread withdraw1 = new WithdrawThread(account, 700);
        DepositThread deposit2 = new DepositThread(account, 300);
        WithdrawThread withdraw2 = new WithdrawThread(account, 900);

        deposit1.start();
        withdraw1.start();
        deposit2.start();
        withdraw2.start();
    }
}
