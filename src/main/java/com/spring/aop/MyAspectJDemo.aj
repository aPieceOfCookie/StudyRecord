package com.spring.aop;

public aspect MyAspectJDemo{
    pointcut recordLog(): call(* HelloWorld.sayHello(..));

    pointcut authCheck():call(* HelloWorld.sayHello(..));

    before(): authCheck(){
        System.out.println("sayHello 方法执行前验证权限");
    }

    after(): recordLog(){
        System.out.println("sayHello方法执行后，日志记录");
    }
}