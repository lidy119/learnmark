package com.algorithm;

/**
 * 选择排序 与冒泡类似都是在一次排序后，把最小的元素放到最前面， 但是过程不同，冒泡是通过相邻的比较和交换，而选择是 通过对整体的选择。
 */
public class SelectSort {

    public static void selectSort(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }
        int minIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) { // 只需要比较n-1次
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) { //从i+1开始比较，因为minIndex默认为i了，i就没有比较比了
                  if(arr[j]<arr[minIndex]){
                      minIndex = j;
                  }
            }
            if(minIndex != i){ //如果minIndex不为i，说明找到了更小的值，交换之
                swap(arr,i,minIndex);
            }
        }
    }
    static void swap(int[] arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {9,8,4,3,7,5,1};
        selectSort(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }
}
