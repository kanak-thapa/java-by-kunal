package com.kanak;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to search: ");
        int serachNum = sc.nextInt();

        int[] arr = {23, 455, 67, 231, 454};

        int ans = search(serachNum, arr);
        System.out.println(ans);
    }

    private static int search(int serachNum, int[] arr) {
        if(arr.length==0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == serachNum) {
                return index;
            }
        }
        return -1;
    }
}
