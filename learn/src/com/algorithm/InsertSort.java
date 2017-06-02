package com.algorithm;

import java.util.Arrays;

/**
 * 插入排序不是通过交换位置二十通过比较找到合适的位置插入元素来
 * 达到排序的目的的。
 * 
 */
public class InsertSort {

   public static void insertSort(int[] arr){
       if(arr == null || arr.length == 0){
           return ;
       }
       //假设第一个数位置是正确的，要往后移动,必须要假设第一个
       for(int i=1;i<arr.length;i++){
           int j = i;
           int target = arr[i];//待插入
           //后移
           while( j>0 && target < arr[j-1]){
               arr[j] = arr[j-1];
               j--;
           }
           //插入
           arr[j] = target;
           System.out.println(Arrays.toString(arr));
       }
   }
    public static void main(String[] args) {
        int[] arr = {9,8,4,3,7,5,1};
        insertSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

}
