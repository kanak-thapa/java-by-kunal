package com.kanak;

import java.util.Arrays;

public class runningSUM {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] newArrat = ArrayFromPermutation(nums);
        System.out.println(Arrays.toString(newArrat));
    }

    private static int[] ArrayFromPermutation(int[] nums) {
        int[] runningSum = new int[nums.length];
        runningSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            runningSum[i] = runningSum[i-1] + nums[i];
        }
        return runningSum;
    }
}
