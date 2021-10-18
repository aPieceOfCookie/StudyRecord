package com.father;

public class Father {

    public static final String name="张三";

    static {
        System.out.println("父类静态区");
    }

    private static void init(){
        System.out.println("父类静态方法");
    }

    public Father(){
        System.out.println("父类构造方法");
    }

    public void eat(){
        System.out.println("父亲吃饭");
    }

    public void drink(){
        System.out.println("父亲喝水");
    }

    public void run(){
        System.out.println(name);
        System.out.println(this.name);
    }

    public void work(){
        System.out.println(name);
    }

}
