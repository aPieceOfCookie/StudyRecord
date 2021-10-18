package com.design.dynamic;

import java.util.Random;

public  class Bird implements FlyAble{
    @Override
    public void fly() {
        System.out.println("fly");
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
