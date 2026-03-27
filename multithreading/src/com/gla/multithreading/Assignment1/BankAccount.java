package com.gla.multithreading.Assignment1;

public class BankAccount implements Runnable {
    private String accountName;
    private int balance;

    public BankAccount(String accountName, int balance) {

        this.accountName = accountName;
        this.balance = balance;
    }
@Override
    public void run() {
        for (int i = 0; i <= 3; i++) {
            System.out.println("Account: " + accountName + "\t Account-Priority:" + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Account balance: " + balance);
        }
    }
}


     class Bank {
        public static void main (String[] args) {
            Thread person1 = new Thread(new BankAccount("Premium", 10000));
            Thread person2 = new Thread(new BankAccount("Regular", 4500));
            Thread person3 = new Thread(new BankAccount("Basic", 3000));
            person1.setPriority(Thread.MAX_PRIORITY);
            person2.setPriority(Thread.NORM_PRIORITY);
            person3.setPriority(Thread.MIN_PRIORITY);

            person1.start();
            person2.start();
            person3.start();
        }
    }

