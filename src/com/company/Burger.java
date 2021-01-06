package com.company;

public class Burger {

    private int numberOfBurgersInSlide = 0;

    public synchronized void increment() {

        while (numberOfBurgersInSlide > 7) {
            try {
                wait(); // lytter til notify() fra andre tråde
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        numberOfBurgersInSlide = numberOfBurgersInSlide + 1;
        notifyAll(); // fortæller alle aktive tråde at counteren er ændret.

    }

    public synchronized void decrement() {

        while (numberOfBurgersInSlide < 1) {
            try {
                wait(); // lytter til notify() fra andre tråde
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        numberOfBurgersInSlide = numberOfBurgersInSlide - 1;
        notifyAll(); // fortæller alle aktive tråde at counteren er ændret.
    }

    public int getNumberOfBurgersInSlide() {
        return numberOfBurgersInSlide;
    }
}
