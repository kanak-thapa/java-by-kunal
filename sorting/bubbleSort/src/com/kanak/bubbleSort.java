package com.kanak;

import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] ans = bubbleSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for(int k = 1; k<arr.length-i; k++){
                if(arr[k]<arr[k-1]){
                    int temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return arr;
    }
}
