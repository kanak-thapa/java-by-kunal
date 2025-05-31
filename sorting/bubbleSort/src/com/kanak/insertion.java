package com.kanak;

import java.util.Arrays;

public class insertion {
    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 5, 8};
        int[] ans = insertionSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j--){
                if (arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int j, int k) {
        int temp = arr[j];
        arr[j] = arr[k];
        arr[k] = temp;
    }
}
