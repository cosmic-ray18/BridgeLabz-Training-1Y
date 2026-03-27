package com.gla.multithreading.Assignment1;

public class Order implements Runnable {
    private int ID;
    private String restaurantName;
    private int deliverytime;
    private String orderStatus;
    private String Membership;

    public Order(int ID, String restaurantName, int deliverytime, String orderStatus, String Membership) {
        this.ID = ID;
        this.restaurantName = restaurantName;
        this.deliverytime = deliverytime * 1000;
        this.orderStatus = orderStatus;
        this.Membership = Membership;
    }

    @Override
    public void run() {
        System.out.println("Order: " + ID + "\tRestaurantname: " + restaurantName + "\tStatus: " + orderStatus + "\t Delivery time: " + Thread.currentThread().getPriority() + " \tHandled by" + Thread.currentThread().getName());
        try {
            Thread.sleep(deliverytime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(">> Order " + ID + " has been successfully processed.");
    }
}

class list{
        public static void main (String[] args) {

            Thread Raju = new Thread(new Order(125001,"Asli pappu Dhaba",10,"Picked up","Express"));
            Thread Ghanshyam = new Thread(new Order(125002,"Gulshan Dhaba",5,"In Transit","Standard"));
            Thread Rihan = new Thread(new Order(1250003,"Shiva Dhaba",3,"Delivered","Economy"));
            Thread Akshit = new Thread(new Order(125004,"Asli pappu Dhaba",5,"In Transit","Standard"));
            Thread Ritvik = new Thread(new Order(125005,"Gulshan Dhaba",5,"In Transit","Standard"));

            Raju.setPriority(10);
            Ghanshyam.setPriority(5);
            Rihan.setPriority(3);
            Akshit.setPriority(5);
            Ritvik.setPriority(5);

            Raju.start();
            Ghanshyam.start();
            Akshit.start();
            Rihan.start();
            Ritvik.start();
        }
}

