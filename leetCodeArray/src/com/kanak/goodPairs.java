package com.kanak;

import java.util.Arrays;

public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = NumOfGoodPairs(nums);
        System.out.println(ans);
    }

    static int NumOfGoodPairs(int[] nums) {
     //lets count the frequency
        int[] count = new int[102];
        for (int i = 0; i < nums.length; i++) {
            int num  = nums[i];
            count[num]++;
        }
        int totalCount = 0;
        for (int i = 0; i < count.length; i++) {
            totalCount += ((count[i])*(count[i]-1))/2;
        }
        return totalCount;
    }

}
