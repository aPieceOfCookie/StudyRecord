package com.leetcode;

import java.util.Scanner;

public class Q413 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer next = scanner.nextInt();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(stairs(i));
        }
    }

    public static int numberOfArithmeticSlices(int [] numArr){
        if(numArr.length>=3){
            for (int i = numArr.length; i > 0 ; i--) {

            }
        }
        return 0;
    }

    /**
     *爬楼梯
     * @param n
     */
    public static int stairs(int n){
        if(n<=2){
            return n;
        }
        int pre=1;
        int bac=2;
        int total=0;
        for (int i = 2; i < n; i++) {
            total=pre+bac;
            pre=bac;
            bac=total;
        }
        return total;
    }

}
