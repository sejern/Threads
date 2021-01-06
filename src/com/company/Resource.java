package com.company;

public class Resource {
    private int counter = 0;
    public synchronized void increment(){
        counter = counter + 1;
        // Thread.wait(); // stopper denne tråd, og frigiver låsen
        // Thread.notify();
    }

    public synchronized void decrement(){
        // en tråd som venter her på en lås, kan så komme ind
        counter = counter - 1;
    }

    public int getCounter() {
        return counter;
    }
}
