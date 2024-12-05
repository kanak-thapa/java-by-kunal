package com.kanak;

public class maxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {3, 4, 5},
                {6, 7, 8}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] arr) {

        int ans = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum = sum + arr[row][col];
            }
            if (sum > ans) {
                ans = sum;
            }
        }

        return ans;
    }
}
