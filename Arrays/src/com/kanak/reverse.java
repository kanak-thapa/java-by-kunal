package com.kanak;

import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println(" " + Arrays.toString(arr));
    }
}
