package com.algorithm;

import java.util.Arrays;

/**
 * 希尔排序是插入排序的一种高效率实现，也叫缩小增量排序。
 * 基本思想：先将整个待记录序列分割为若干子序列分别进行直接插入排序，
 * 待整个序列中的记录基本有序时，再对全体记录进行一次直接插入排序。
 */
public class ShellSort {

    public static void shellInsert(int[] arr , int d){
        for(int i=d;i<arr.length;i++){
            int j = i - d;
            int temp = arr[i]; //记录要插入的数据
            while( j>=0 && arr[j] > temp ){ //从后向前
                arr[j+d] = arr[j]; //向后挪动
                j -= d;
            }
            
            if(j != i-d){ //存在比其小的数
                arr[j+d] = temp;
            }
        }
    }
    
    public static void shellSort(int[] arr){
        if(arr == null || arr.length == 0){
            return ;
        }
        int d = arr.length / 2;
        while(d >= 1){
            shellInsert(arr,d);
            d /= 2;
            System.out.println(Arrays.toString(arr));
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {9,8,4,3,7,5,1};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
