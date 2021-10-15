package com.algorithm;

import java.util.Arrays;
import java.util.Collections;

public class DcSort {
    public static void main(String[] args) {
        int [] mums={9,6,2,4,1,3,5,7,0,8};
        sort4(mums);
        System.out.println(Arrays.toString(mums));
        System.out.println(5/2);
    }

    /**
     * 希尔排序
     * @param nums
     */
    public static void sort4(int [] nums){
        //数组长度
        int length=nums.length;
        //选择临界
        int half= length/2;
        while (half>=1){
            for (int i = half; i < length ; i++) {
                int num=nums[i];
                int j=i;
                if(nums[j-half]>num){
                    nums[j]=nums[j-half];
                    j-=half;
                }
                nums[j]=num;
            }

            half=half/2;
        }
    }

    private static void swap(int [] nums,int i,int j){
        int num=nums[i];
        nums[i]=nums[j];
        nums[j]=num;
    }

}
