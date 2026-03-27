package com.gla.multithreading.Assignment1;

public class CustomerCare implements Runnable {

    private int Ticket_ID;
    private String type;
    private int processedtime;

    public CustomerCare(int Ticket_ID, String type, int processedtime) {
        this.Ticket_ID = Ticket_ID;
        this.type = type;
        this.processedtime = processedtime * 1000;
    }

    @Override
    public void run() {
        System.out.println("[Ticket_ID" + Ticket_ID + "]\t" + "type" + ":" + type + "\tAssigned: " + Thread.currentThread().getName() + "\tPriority:" + Thread.currentThread().getPriority());
        try {
            Thread.sleep(processedtime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("This ticket has been successfully processed.");
    }
}
    class Window {
        public static void main (String[] args) {

            Thread thread1 = new Thread(new CustomerCare(303,"Feedback",1));
            Thread thread2 = new Thread(new CustomerCare(306,"General query",2));
            Thread thread3 = new Thread(new CustomerCare(309,"Feedback",1));
            Thread thread4 = new Thread(new CustomerCare(310,"Feature request",4));
            Thread thread5 = new Thread(new CustomerCare(312,"Feedback",1));
            Thread thread6 = new Thread(new CustomerCare(315,"Feedback",1));
            Thread thread7 = new Thread(new CustomerCare(318,"General query",2));
            Thread thread8 = new Thread(new CustomerCare(321,"Feedback",1));
            Thread thread9 = new Thread(new CustomerCare(324,"Feedback",1));
            Thread thread10 = new Thread(new CustomerCare(327,"Critical bugs",10));

            thread1.setPriority(1);
            thread2.setPriority(2);
            thread3.setPriority(1);
            thread4.setPriority(4);
            thread5.setPriority(1);
            thread6.setPriority(1);
            thread7.setPriority(2);
            thread8.setPriority(1);
            thread9.setPriority(1);
            thread10.setPriority(10);

            thread1.start();
            thread2.start();
            thread3.start();
            thread4.start();
            thread5.start();
            thread6.start();
            thread7.start();
            thread8.start();
            thread9.start();
            thread10.start();

            System.out.println("Average ")
    }
}
