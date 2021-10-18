package com.father;

public class Child extends Father {

    public static final String name="李四";

    static {
        System.out.println("儿子静态代码块");
    }

    private static void init(){
        System.out.println("子类静态方法");
    }

    public Child(){
        System.out.println("子类构造方法");
    }

    public void eat() {
        System.out.println("儿子吃饭");
    }

    public void run(){
        System.out.println(name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        /*Father father1 = new Father();
        father1.drink();
        father1.eat();
        father1.run();
        father1.work();*/
        //向上转型
        /*Father father=new Child();

        father.work();
        father.eat();
        father.run();
        father.drink();*/

        /*Child child = new Child();

        child.eat();
        child.run();
        child.work();
        child.drink();*/

    }
}
