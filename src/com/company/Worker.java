package com.company;

public class Worker implements Runnable{

    private Resource resource;
    private int repeats = 0;

    public Worker(Resource resource) {
        this.resource = resource;
    }
    @Override
    public void run() {
        while (repeats < 100000) {
            resource.increment();
            repeats++;

        }
        System.out.println("Done: " + resource.getCounter());
    }

}
