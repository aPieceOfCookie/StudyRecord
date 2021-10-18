package com.design.dynamic;

/**
 * 动态代理
 * <a href="https://www.jianshu.com/p/fc285d669bc5“/>
 */
public class DcDynamicProxy extends Bird {

    public static void main(String[] args) {
        Bird bird = new Bird();
        BirdTimeProxy birdTimeProxy = new BirdTimeProxy(bird);
        BirdLogProxy birdLogProxy = new BirdLogProxy(birdTimeProxy);
        birdLogProxy.fly();
    }

    /**
     * 方法1，通过实现类的方式计算执行时间
     */
    public void dynamicDemo1(){
        long begin = System.currentTimeMillis();
        Bird bird = new Bird();
        bird.fly();
        long end = System.currentTimeMillis();
        //输出飞行时间
        System.out.println(begin-end);
    }

    /**
     * 方法二：通过继承来调用父类方法
     */
    public void dynamicDemo2(){
        long begin = System.currentTimeMillis();
        super.fly();
        long end = System.currentTimeMillis();
        //输出飞行时间
        System.out.println(begin-end);
    }
}
