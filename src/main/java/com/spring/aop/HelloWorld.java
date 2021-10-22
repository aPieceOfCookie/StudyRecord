package com.spring.aop;

public class HelloWorld {
    public void sayHello(){
        System.out.println("hello world");
    }

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.sayHello();
    }
}
