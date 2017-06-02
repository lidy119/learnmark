package com.algorithm;

import java.util.Arrays;

/**
 * 快速排序的思想来自冒泡排序，冒泡排序是通过相邻的比较
 * 和交换把最小的冒泡到顶端，而快速排序是比较和交换小数和
 * 大数，这样一来把小数冒泡到上面同时，也把大数沉到下面。
 * 
 * 总之快速排序思想是： 冒泡 + 二分 + 递归分治 
 */
public class QuickSort {

    public static int partition(int[] arr,int left ,int right){
        int pivotKey = arr[left];
        int pivotPointer = left;
        
        while(left < right){
            while(left<right && arr[right] >= pivotKey){
                right--;
            }
            while(left<right&&arr[left]<=pivotKey){
                left++;
            }
            swap(arr,left,right); //把大的交换到右边，把小的交换到左边
        }
        swap(arr,pivotPointer,right); //最后把pivot交换到中间
        return left;
    }
    //优化后的思路
    public static int partitionMore(int[] arr,int left ,int right){
        int pivotKey = arr[left];
       // int pivotPointer = left;
        
        while(left < right){
            while(left<right && arr[right] >= pivotKey){
                right--;
            }
            arr[left] = arr[right]; //把小的移动到左边
            while(left<right&&arr[left]<=pivotKey){
                left++;
            }
            arr[right] = arr[left]; //把大的移动到右边 
//            swap(arr,left,right); //把大的交换到右边，把小的交换到左边
        }
//        swap(arr,pivotPointer,right); //最后把pivot交换到中间
        arr[left] = pivotKey; //最后把pivot赋值到中间
        return left;
    }
    
    public static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    
    public static void quickSort(int[] arr,int left,int right){
        if(left >= right){
            return ;
        }
//        int pivotPos = partition(arr, left, right);
        int pivotPos = partitionMore(arr, left, right);
        quickSort(arr, left, pivotPos-1);
        quickSort(arr,pivotPos+1,right);
    }
    public static void main(String[] args) {
        int[] arr = {9,8,4,3,7,5,1};
        quickSort(arr,0 , 6);
        System.out.println(Arrays.toString(arr));
    }

}
