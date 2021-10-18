package com.algorithm;

import java.util.Arrays;

/**
 * @Author {一块儿小饼干}
 * @ProjectName StudyRecord
 * @Description 排序
 * @Date 2021/10/14 22:55
 **/
public class DSort   {
    public static void main(String[] args) {
        int [] arr={2,3,1,5,4};
        sort2(arr);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 选择排序
     * @param nums
     */
    public static void sort1(int [] nums){
        int num=nums.length;
        for (int i = 0; i < num; i++) {
            int min=i;
            for (int j = i+1; j < num ; j++) {
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            swap(nums,i,min);
        }
    }

    /**
     * 冒泡
     * @param nums
     */
    public static void sort2(int [] nums){
        for (int i = 1; i <= nums.length - 1; i++) {
            System.out.println("第"+i+"轮");
            for (int j = 0; j < nums.length - i; j++) {
                if(nums[j]<nums[j+1]){
                    swap(nums,j,j+1);
                }
            }
        }
    }

    /**
     * 插入排序
     * @param nums
     */
    public static void sort3(int [] nums){
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j > 0; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j - 1);
                }
            }
        }
    }

    private static void swap(int [] nums,int i,int j){
        int num=nums[i];
        nums[i]=nums[j];
        nums[j]=num;
    }
}
