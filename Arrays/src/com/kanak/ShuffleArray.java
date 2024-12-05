package com.kanak;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};

        int ans[] = shuffleArr(nums, 3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffleArr(int[] nums, int n) {
        int[] newArr = new int[2*n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            newArr[count] = nums[i];
            newArr[count+1] = nums[i+n];
            count+=2;
        }
        return newArr;
    }
}
