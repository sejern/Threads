package com.company;

public class Main {

    public static void main(String[] args) {
        int a;
        Burger burger = new Burger();

        Producer producer = new Producer(burger);
        Cashier cashier = new Cashier(burger);

        Thread t1 = new Thread(producer, "Producer");
        Thread t2 = new Thread(cashier, "Cashier");

        t1.start();
        t2.start();
    }


//    public static void main(String[] args) {
//        Resource resource = new Resource();
//
//        Worker w1 = new Worker(resource);
//        Worker w2 = new Worker(resource);
//        Thread t1 = new Thread(w1);
//        Thread t2 = new Thread(w2);
//        t1.start();
//        t2.start();
//    }



//    public static void main(String[] args) {
//        Car astonMartin = new Car("Aston Martin");
//        Car porsche = new Car("Porsche");
//        Thread thread1 = new Thread(astonMartin);
//        Thread thread2 = new Thread(porsche);
//        thread1.start();
//        thread2.start();
//    }

}
