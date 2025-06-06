package com.kanak;

public class AgnosticBinary {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        //int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int targate = 22;
        int ans = orderAgnosticBS(arr, targate);
        System.out.println(ans);


    }

    private static int orderAgnosticBS(int[] arr, int targate) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == targate) {
                return mid;
            }
            if(isAsc){
                if(arr[mid] > targate){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(arr[mid] < targate){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}