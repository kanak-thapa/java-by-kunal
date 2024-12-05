package com.kanak;

public class minimumNum {
    public static void main(String[] args) {
        int[] arr = {22, 455, 67, 231, 454, 21, 23};
        int ans = minNumber(arr);
        System.out.println(ans);
    }

    private static int minNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                //return arr[i];
            }
        }
        return min;
    }
}
