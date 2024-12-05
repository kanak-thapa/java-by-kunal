package com.kanak;

import java.util.Arrays;

public class Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        boolean[] ans = GreatestNumberCandies(candies, extraCandies);
        System.out.println(Arrays.toString(ans));
    }
    static int MaximumNumber(int[] candies) {
        int max = candies[0];
        for (int i = 0; i < candies.length; i++) {
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }

    static boolean[] GreatestNumberCandies(int[] candies, int extraCandies) {
        boolean[] ans = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int maximum = MaximumNumber(candies);
            if (candies[i] + extraCandies >= maximum) {
                ans[i] = true;
            }
            else{
                ans[i] = false;
            }
        }
        return ans;
    }
}
