package com.gla.multithreading.Assignment1;

public class Examhall implements Runnable {
    private String task;
    private String status;
    private int time;
    public Examhall(String task, String status, int time) {
        this.task = task;
        this.status = status;
        this.time = time*1000;
    }
    @Override
    public void run() {
        System.out.println("Examhall " + task + "\tstatus: " + status);
        try {
            Thread.sleep(time);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Examhall " + task + " has been successfully processed.");

    }
}

class tasklist {
    public static void main (String [] args) {

        Thread thread1 = new Thread(new Examhall("Question paper", "yet to be distributed", 10));
        Thread thread2 = new Thread(new Examhall("Attendance", "marked", 8));
        Thread thread3 = new Thread(new Examhall("Entry", "Monitoring", 5));
        Thread thread4 = new Thread(new Examhall("Paper Collection", "Time left ", 7));

        thread1.setPriority(10);
        thread2.setPriority(8);
        thread3.setPriority(5);
        thread4.setPriority(7);

        thread3.start();
        thread2.start();
        thread1.start();
        thread4.start();

    }
}
