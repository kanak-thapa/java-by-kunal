package com.kanak;

public class letterComparision {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j', 'm', 'z'};
        char target = 'k';//we want m
        char ans = charcheck(arr, target);
        System.out.println(ans);
    }

    private static char charcheck(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
        }
        return arr[start];
    }
}
