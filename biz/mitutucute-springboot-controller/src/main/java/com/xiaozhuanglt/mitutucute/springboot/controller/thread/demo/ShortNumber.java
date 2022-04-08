package com.xiaozhuanglt.mitutucute.springboot.controller.thread.demo;

import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ShortNumber {

    public static void main(String[] args) {

        // 多线程排序方式1
        int i = 0;
        while (i < 100){
            i ++;
            printNumOrder();
        }

        // 多线程排序方式2
        ShortNumber shortNumber = new ShortNumber();
        InnerShortByLock innerShortByLock = shortNumber.new InnerShortByLock();
        for (int j=1; j<=3; j++) {
            int finalJ = j;
            new Thread(() ->{
                innerShortByLock.run(finalJ);
            }).start();
        }

        // 多线程排序方式2
        for (int j=1; j<=3; j++) {
            int finalJ = j;
            new Thread(() -> innerShortByLock.run(finalJ)).start();
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

    class InnerShortByLock{
        private final Lock lock = new ReentrantLock(true);
        private volatile int pos = 1;
        private volatile int count = 0;
        private volatile int times = 0;

        public void run(int i) {
            int next = i % 3 + 1;
            while (times < 100) {
                lock.lock();
                if (pos == i) {
                    System.out.println("T-" + i + " -count:" +count);
                    times ++;
                    pos = next;
                    count = 0;
                } else {
                    count ++;
                }
                lock.unlock();
            }
        }
    }

    public InnerShortByLock getInnerShortByLock(){
        return new InnerShortByLock();
    }

    class RunnableImplements implements Runnable {

        @Override
        public void run() {

        }
    }

    class ThreadExtends extends Thread {
        public void run(){

        }
    }

}
