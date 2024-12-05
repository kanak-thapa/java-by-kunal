package com.kanak;

import java.util.Arrays;

public class concatArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int length = nums.length;
        int[] newArrat = ArrayFromPermutation(nums, length);
        System.out.println(Arrays.toString(newArrat));
    }

    static int[] ArrayFromPermutation(int[] nums, int length) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
    return ans;
    }
}
