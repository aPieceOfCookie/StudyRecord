package com.design.dynamic;

/**
 * 使用聚合的方式
 * 其实就是Bird抽离实例化对象，在构造时传入参数进行调用
 */
public class BirdLogProxy implements FlyAble{

    private FlyAble fly;

    public BirdLogProxy(FlyAble fly) {
        this.fly = fly;
    }

    @Override
    public void fly() {
        System.out.println("Log print begin");
        fly.fly();
        System.out.println("Log print end");
    }
}
