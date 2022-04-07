package com.xiaozhuanglt.mitutucute.springboot.controller.thread.demo;

import lombok.SneakyThrows;

public class ShortNumber {

    public static void main(String[] args) {

        int i = 0;
        while (i < 100){
            i ++;
            printNumOrder();
        }

    }
    public static void printNumOrder(){

        Thread a = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });

        Thread b = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                a.join();
                System.out.println("2");
            }
        });

        Thread c = new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                b.join();
                System.out.println("3");
            }
        });

        a.start();
        b.start();
        c.start();
    }

}
