package com.kanak;

import java.util.Arrays;

public class maximumWealth {
    public static void main(String[] args) {
        int [][] arr = {
                {1, 2, 3},
                {3, 2, 1},
                {4, 5, 6},
        };
        //int []  arr1 = {1, 3, 45, 32};
        //System.out.println(Arrays.deepToString(arr));
        int ans = sumOfOneElem(arr);
        System.out.println(ans);
    }

    static int sumOfOneElem(int[][] arr) {
        int ans = 0;
        for(int row = 0; row < arr.length; row++) {
            int sum = 0;

            for(int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            System.out.println(sum);
            if (sum > ans) {
                ans = sum;
            }
        }
        System.out.println("rich: " + ans);
        return ans;
    }
}
