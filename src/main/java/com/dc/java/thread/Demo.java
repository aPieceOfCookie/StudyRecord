package com.dc.java.thread;

public class Demo {
    public static void main(String[] args) {

    }


    private void demo1(){
        MyThread1 thread1=new MyThread1("A");
        MyThread1 thread2=new MyThread1("B");
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
