package com.kanak;

import java.util.Arrays;
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the index of number: ");
        int index1 = sc.nextInt();
        System.out.print("Enter the index of number: ");
        int index2 = sc.nextInt();

        int[] arr1 = {1, 3, 23, 9, 18};

        swap(index1, index2, arr1);

        System.out.println(Arrays.toString(arr1));
    }
    public static void swap(int index1, int index2, int[] arr1){
        int temp = arr1[index1];
        arr1[index1] = arr1[index2];
        arr1[index2] = temp;
    }
}
