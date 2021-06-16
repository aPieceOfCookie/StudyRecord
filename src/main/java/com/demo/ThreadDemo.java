package com.demo;

import com.thread.MyThread1;

public class ThreadDemo {
    public static void main(String[] args) {

    }


    private void demo1(){
        MyThread1 thread1=new MyThread1("A");
        MyThread1 thread2=new MyThread1("B");
        new Thread(thread1).start();
        new Thread(thread2).start();
    }
}
