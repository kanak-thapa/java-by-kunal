package com.kanak;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        int n = 3;
        int[] ans = ShuffleTheArray(nums, n);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] ShuffleTheArray(int[] nums, int n) {
        int[] ans = new int[n*2];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ans[count] = nums[i];
            ans[count+1] = nums[n+i];
            count+=2;
        }
        return ans;
    }
}
