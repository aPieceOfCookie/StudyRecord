package com.design.dynamic;

/**
 * 时间计算类
 */
public class BirdTimeProxy implements FlyAble{
    private FlyAble flyAble;

    public BirdTimeProxy(FlyAble flyAble) {
        this.flyAble = flyAble;
    }

    @Override
    public void fly() {
        long begin = System.currentTimeMillis();
        flyAble.fly();
        long end = System.currentTimeMillis();
        System.out.println("飞行时间："+(begin-end));
    }
}
