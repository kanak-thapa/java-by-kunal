package com.kanak;

public class goodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int result = goodPairsOfNum(nums);
        System.out.println(result);
    }
    private static int goodPairsOfNum(int[] nums) {

        int[] count = new int[102];
        //this is helping us to know get how many number are repeated
        //new array is formed
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            count[num]++;
        }

        int totalCount = 0;
        for (int j = 0; j < count.length; j++) {
            int i = count[j];
            totalCount += ((i) * (i - 1)) / 2;
        }
        return totalCount;
    }
}
