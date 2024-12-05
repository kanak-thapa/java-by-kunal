package com.kanak;

import java.util.Arrays;

public class SmallerThanCurrentElem {
    public static void main(String[] args) {
        int[] nums = {8,1,2,2,3};
        int[] result = SCurrentElement(nums);
        System.out.println(Arrays.toString(result));
    }
    public static int[] SCurrentElement(int[] nums) {
        int[] count = new int[102];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i]= count[i]+count[i-1];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {
            if(nums[i]==0){
                result[i]=0;
            }
            else{
                result[i]=count[nums[i]-1];
            }
        }
        return result;
    }
}
