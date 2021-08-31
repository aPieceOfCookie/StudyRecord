package com.father;

public class Child extends Father {
    public Child() {
        super("bb");
        System.out.println("我是儿子");
    }

    public static void main(String[] args) {
        //向上转型
        Father father=new Child();
        //向下转型
        Child child=(Child)father;
    }
}
