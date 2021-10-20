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

    /**
     * 快速排序
     * @param nums
     * @param left
     * @param right
     */
    public static void quickSort(int[] nums,int left,int right){
        //标记数组的左右边际。
        int i=left;
        int j=right;
        //如果下标左大于右，那么代表数组已经无法再分
        if(left>=right){
            return;
        }
        //每次都取最左边数为基数。如果取最左边的数为基数，那么就先从最右边开始遍历。取右边取反。
        int pivot=left;
        //先从最右边开始比较
        while (right>left){
            //如果值大于基数，那么就跳过。right > left防止边界溢出
            while (nums[right] >= nums[pivot] && right > left){
                right--;
            }
            //从左边计算，如果值小于基数就++
            while (nums[left] <= nums[pivot] && right > left){
                left++;
            }
            swap(nums,left,right);
        }
        //排序完毕后，i和j都指向了基数在的位置，进行换位
        swap(nums,left,pivot);
        pivot=right;
        //左边数组
        quickSort(nums,i,pivot-1);
        //右边数组递归
        quickSort(nums,pivot+1,j);
    }

    /**
     * 交换算法
     * @param nums
     * @param i
     * @param j
     */
    private static void swap(int [] nums,int i,int j){
        int num=nums[i];
        nums[i]=nums[j];
        nums[j]=num;
    }
}
