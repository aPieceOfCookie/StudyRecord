package com.dc.java.thread;

import java.util.Random;

/**
 * 多线程学习
 */
public class MyThread1 implements Runnable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyThread1(String name) {
        this.name = name;
    }

    public MyThread1() {
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name+"运行第："+i+"次");
            try {
                Thread.sleep((int) (Math.random() * 10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
