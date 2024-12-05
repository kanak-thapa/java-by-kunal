package com.kanak;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1};
        int[] result = ConcatinationOfArray(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] ConcatinationOfArray(int[] nums) {
        int[] ans = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }
}
