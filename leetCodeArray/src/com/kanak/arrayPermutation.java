package com.kanak;

import java.util.Arrays;

public class arrayPermutation {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] newArrat = ArrayFromPermutation(nums);
        System.out.println(Arrays.toString(newArrat));
    }

    static int[] ArrayFromPermutation(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }
}
