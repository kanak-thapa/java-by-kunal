package com.kanak;

import java.util.Arrays;

public class NumSmallCurrent {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] ans = numberOfSmallerCurrentNum(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] numberOfSmallerCurrentNum(int[] nums) {
        int[] count = new int[102];
        for(int i = 0; i<nums.length; i++){
            int num = nums[i];
            count[num]++;
        }
        //here we will get the count where the element have become indexes and the value of them gives us the frequency of that index
        for(int i = 1; i<count.length; i++){
            count[i]= count[i] + count[i-1];
        }
        int[] ans = new int[nums.length];
        for(int i = 0; i<ans.length; i++){
            if(nums[i]==0){
                ans[i]=0;
            }
            else{
                ans[i] = count[nums[i]-1];
            }
        }
        return ans;
    }
}
