package com.language;

/**
 * <code>volatile</code>关键字<br>
 * volatile是Java提供的一种轻量级的同步机制。Java 语言包含两种内在的同步机制：同步块（或方法）和 volatile 变量，相比于synchronized（synchronized通常称为重量级锁），
 * volatile更轻量级，因为它不会引起线程上下文的切换和调度。但是volatile 变量的同步性较差（有时它更简单并且开销更低），而且其使用也更容易出错。
 */
public class DcVolatile {
    private static volatile Integer a;
    public static void main(String[] args) {

    }
}
