package com.kanak;

import java.util.Arrays;

public class candies {
    public static void main(String[] args) {
        int[] arr = {12,1,12};
        int extraCandies = 10;
        int arrLength = arr.length;
        boolean[] result = kidsWithCandies(arr, extraCandies);
        System.out.println(Arrays.toString(result));
    }

    private static boolean[] kidsWithCandies(int[] candies, int extraCandies) {
        boolean[] newArray = new boolean[candies.length];
        for (int i = 0; i < candies.length; i++) {
            int helpFunc = greatestCandie(candies);
            if(candies[i] + extraCandies >= helpFunc){
                newArray[i] = true;
            }
            else {
                newArray[i] = false;
            }
        }
        return newArray;
    }

    private static int greatestCandie(int[] candies) {
        int max = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        return max;
    }
}
