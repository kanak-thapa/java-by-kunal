package com.kanak;

import java.util.Arrays;
import java.util.Scanner;

public class searchNum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int searchNum = sc.nextInt();
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12},
        };
        int[] ans = searchNumber(arr, searchNum);

        System.out.println(Arrays.toString(ans));
    }

    static int[] searchNumber(int[][] arr, int searchNum) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (searchNum == arr[row][col]) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
