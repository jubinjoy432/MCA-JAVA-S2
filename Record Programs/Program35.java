class Bank {
    int balance = 0;

    public synchronized void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
        notifyAll();
    }

    public synchronized void withdraw(int amount) {
        try {
            while (balance < amount) {
                System.out.println("Waiting for deposit...");
                wait(3000);

                if (balance < amount) {
                    System.out.println("Transaction failed: Insufficient balance");
                    return;
                }
            }
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        } catch (Exception e) {
        }
    }
}

class ATM extends Thread {
    Bank bank;
    boolean isDeposit;
    int amount;

    ATM(Bank bank, boolean isDeposit, int amount) {
        this.bank = bank;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    public void run() {
        if (isDeposit)
            bank.deposit(amount);
        else
            bank.withdraw(amount);
    }
}
public class Program35 {
    public static void main(String args[]) {

        Bank bank = new Bank();

        ATM t1 = new ATM(bank, false, 500);
        ATM t2 = new ATM(bank, true, 1000);
        ATM t3 = new ATM(bank, false, 300);

        t1.start();
        t2.start();
        t3.start();
    }
}
