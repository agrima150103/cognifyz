class BankAccount {
    private int balance = 1000;

    // synchronized method to safely withdraw money
    public synchronized void withdraw(int amount, String threadName) {
        if (balance >= amount) {
            System.out.println(threadName + " is going to withdraw $" + amount);
            balance -= amount;
            System.out.println(threadName + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println(threadName + " tried to withdraw $" + amount + " but not enough balance.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;
    private int amount;

    public WithdrawTask(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        account.withdraw(amount, threadName);
    }
}

public class MultiThreadedApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Create two threads trying to withdraw from the same account
        Thread t1 = new Thread(new WithdrawTask(account, 700), "Thread-1");
        Thread t2 = new Thread(new WithdrawTask(account, 500), "Thread-2");

        t1.start();
        t2.start();

        // Wait for threads to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final balance: $" + account.getBalance());
    }
}
