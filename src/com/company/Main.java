package com.company;

import com.company.interfaces.impl.Collect;

public class Main {

    public static void main(String[] args) {

        Collect collect1 = new Collect();
        Collect collect2 = new Collect();
        long start = System.nanoTime();


        for (int i = 0; i < 100; i++) {
            collect1.add("1");

        }
        System.out.println(System.nanoTime() - start);

        for (int i = 0; i < 100; i++) {
            collect2.addOld("2");
        }
        System.out.println(System.nanoTime() - start);


        for (int i = 0; i < 1000; i++) {
            collect1.add("1");
        }
        System.out.println(System.nanoTime() - start);

        for (int i = 0; i < 1000; i++) {
            collect2.addOld("2");
        }
        System.out.println(System.nanoTime() - start);

        for (int i = 0; i < 1000000; i++) {
            collect1.add("1");
        }
        System.out.println(System.nanoTime() - start);

        for (int i = 0; i < 1000000; i++) {
            collect2.addOld("2");
        }
        System.out.println(System.nanoTime() - start);


    }
}


