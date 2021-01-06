package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MultiCore {

    public static void main(String[] args) {
        new MultiCore();
    }

    public  MultiCore(){
        for (int i = 0; i < 4 ; i++) {
            new Workers(System.currentTimeMillis()).start();

        }
    }

    static class Workers extends Thread{

        long startTime;
        public  Workers(long s){
            startTime = s;
        }

        @Override
        public void run() {
            super.run();
            List<String> list = new ArrayList<>();
            Random random = new Random();
            int c = 0;
            while(c < 1000000){
                list.add(random.nextInt(1000000) + "");
                c++;
            }
            long diff = System.currentTimeMillis() - startTime;
            System.out.println("Done: " + Thread.currentThread().getName() + " t: " + diff);
        }
    }
}
