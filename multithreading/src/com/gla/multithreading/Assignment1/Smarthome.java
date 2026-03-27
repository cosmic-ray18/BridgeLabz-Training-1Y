package com.gla.multithreading.Assignment1;

public class Smarthome implements Runnable {
    private String name;
    private String status;
    private int interval;

    public Smarthome(String name, String status , int intervalseconds) {
        this.name = name;
        this.status = status;
        this.interval = intervalseconds*1000;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name  + ":" + "\t" + "status" + ":" + status);

            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " device " + "has completed its five cycles");
    }
    public static class Smarthometest {
        public static void main(String[] args) {

            Thread Security = new Thread(new Smarthome("Security camera" , "All clear" ,3  ));
            Thread Temperature = new Thread(new Smarthome("Temperature Sensor" , "cold temperature",5 ));
            Thread Light = new Thread(new Smarthome("Light controller" , "Dim light",4 ));
            Thread Door = new Thread(new Smarthome("Door lock monitor " , "closed door" , 6));

            Security.setPriority(10);
            Temperature.setPriority(7);
            Light.setPriority(5);
            Door.setPriority(5);

            Security.start();
            Temperature.start();
            Light.start();
            Door.start();
          }
        }


}
