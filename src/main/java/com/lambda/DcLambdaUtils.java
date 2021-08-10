package com.lambda;

import org.apache.poi.ss.formula.functions.T;

import java.util.Comparator;

public class DcLambdaUtils {

    public static final void main(String[] args) {
        Operator addOper = (a, b) -> a + b;
        Operator reduceOper = (a, b) -> a - b;
        Operator multiplyOper = (a, b) -> a * b;
        Operator DivideOper = (a, b) -> a / b;

        DcLambdaUtils test = new DcLambdaUtils();
        System.out.println(test.getResult(3, 3, addOper));
        System.out.println(test.getResult(3, 3, reduceOper));
        System.out.println(test.getResult(3, 3, multiplyOper));
        System.out.println(test.getResult(3, 3, DivideOper));
    }

    public int getResult(int a, int b, Operator operator) {
        return operator.convert(a, b);
    }

    public interface Operator {
        int convert(int a, int b);
        default int get(int a) {
            return a;
        }

        // Object 基类方法可以有
        @Override
        boolean equals(Object obj);
        @Override
        String toString();
        @Override
        int hashCode();
    }

}
