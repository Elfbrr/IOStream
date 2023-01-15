package org.example;

import java.time.LocalDate;

public class Multithreading {
    public static void main(String[] args) {
        int n=200;
        LocalDate start= LocalDate.now();
        System.out.println(LocalDate.now());

        for (int i = 0; i < 5; i++) {
            MultithreadThing mything= new MultithreadThing(i);
            mything.start();
        }

    }
}
