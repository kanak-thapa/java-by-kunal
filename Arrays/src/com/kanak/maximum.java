package com.kanak;

public class maximum {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        //           0  1   2   3   4
        System.out.println(maxNum(arr, 1, 4));
    }

    private static int maxNum(int[] arr,  int start, int end) {
        int max = arr[0];
        for (int i = start; i <= end; i++) {
            System.out.println(arr[i]);
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
