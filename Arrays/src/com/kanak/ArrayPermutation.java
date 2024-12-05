package com.kanak;

import java.util.Arrays;

class ArrayPermutation {
    public static void main(String args[]){
        int nums[] = {0,2,1,5,3,4};
        int[] solution = arrPermutation(nums);
        System.out.print(Arrays.toString(solution));
    }
    public static int[] arrPermutation(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0; i<nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}