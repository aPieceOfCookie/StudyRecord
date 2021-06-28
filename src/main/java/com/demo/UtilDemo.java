package com.demo;

import com.father.Child;

import java.util.Date;
import java.util.HashSet;

public class UtilDemo {
    public static void main(String[] args) {
       /* int a=10;
        int b=2;
        int c=6;
        System.out.println(a/b);
        System.out.println(a/c);
        System.out.println(1/6);*/

        /*Child child=new Child();*/
        /*char a=65;
        System.out.println(a<<1);
        System.out.println(a >> 1);
        System.out.println(a >>> 1);
    */
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        int m=1;
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 10; j++) {
                try {
                    Thread.sleep(1L);
                    m++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(m);
        long timeMillis = System.currentTimeMillis();
        System.out.println(timeMillis);
        long l =  timeMillis - currentTimeMillis;
        System.out.println(l);
        int x=1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 1000; j++) {
                try {
                    Thread.sleep(1L);
                    x++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(x);
        long l1 = System.currentTimeMillis();
        System.out.println(l1);
        System.out.println(l1-timeMillis);
    }
}
