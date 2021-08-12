package com.design;

import java.lang.reflect.Field;

/**
 * 单例模式 <br>
 *      确保一个类只有一个实例，并提供该实例的全局访问点。<br>
 *      使用一个私有构造函数、一个私有静态变量以及一个公有静态函数来实现。私有构造函数保证了不能通过构造函数来创建对象实例，只能通过公有静态函数返回唯一的私有静态变量。
 */
public class DcSingleton {
    private static DcSingleton singleton;

    public DcSingleton() {
    }

    /**
     * 懒汉模式，线程不安全
     */
    public static DcSingleton lazyUnSafe(){
        if(singleton==null){
            singleton=new DcSingleton();
        }
        return singleton;
    }
    /**
     * 懒汉模式，安全 <Code>private static Singleton uniqueInstance = new Singleton();</Code>
     */
    public void safe(){

    }

    /**
     * 懒汉线程安全   <br>
     * 有性能问题，每个线程访问，其他都会被阻塞
     * @return
     */
    public static synchronized DcSingleton getUniqueInstance() {
        if (singleton == null) {
            singleton = new DcSingleton();
        }
        return singleton;
    }

    /**
     * 双重校验锁-线程安全
     * @return
     */
    public static DcSingleton getDcSingleton(){
        if (singleton == null) {
            synchronized (DcSingleton.class) {
                if (singleton == null) {
                    singleton = new DcSingleton();
                }
            }
        }
        return singleton;
    }
}
