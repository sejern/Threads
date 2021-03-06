package com.company;

public class Producer implements Runnable {

    private Burger burger;

    public Producer(Burger burger) {
        this.burger = burger;
    }

    @Override
    public void run() {
        while(true){
            burger.increment();
            System.out.println("Amount of burgers in slide: " + burger.getNumberOfBurgersInSlide()
                    + " : " + Thread.currentThread().getName());
            try {
                Thread.sleep((int) (Math.random() * 1000));
            }catch (Exception e ){
                e.printStackTrace();
            }

        }
    }
}
