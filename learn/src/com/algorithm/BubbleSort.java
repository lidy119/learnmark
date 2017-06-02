package com.algorithm;

/**
 * 冒泡排序 思想： 通过与相邻元素的比较和交换来把小的数交换到最前面， 这个过程类似于水泡上升一样，因此而得名。
 */
public class BubbleSort {

    static void bubbleSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j - 1, j); //交换
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
       int[] arr = {9,3,1,8,4,3,8,7,5,1};
       bubbleSort(arr);
       for(int i : arr){
           System.out.println(i);
       }
    }

}
