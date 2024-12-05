package com.kanak;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 10, 1};
//        int sum = 0;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i];
//        }
        //System.out.println(sum);
        int[] result = RunningSumofArray(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] RunningSumofArray(int[] nums) {
        //int sum = 0;
        for (int i = 0; i < nums.length; i++) {

            for (int j = 0; j < i; j++) {
                nums[i] += nums[j];
            }
        }
        return nums;
    }
}
