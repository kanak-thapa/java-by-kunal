package com.kanak;

public class RBS {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(searchRotated(arr, target, 0, arr.length-1));
    }
    public static int searchRotated(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        // Left half is sorted
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target < arr[mid]) {
                return searchRotated(arr, target, start, mid - 1);
            } else {
                return searchRotated(arr, target, mid + 1, end);
            }
        }

        // Right half is sorted
        if (arr[mid] <= arr[end]) {
            if (arr[mid] < target && target <= arr[end]) {
                return searchRotated(arr, target, mid + 1, end);
            } else {
                return searchRotated(arr, target, start, mid - 1);
            }
        }

        return -1; // Not found
    }

    // static int BinarySearchfirst(int[] arr, int target) {
    //     int pivot = findPivot(arr);

    //     //if you did not find a pivot, it means the array is not rotated
    //     if(pivot == -1){
    //         //just do normal Bearch
    //         return binarySearch(arr, target, 0, arr.length-1);
    //     }
    //     if(arr[pivot] == target){
    //         return pivot;
    //     }
    //     if(target>=arr[0]){
    //         return binarySearch(arr, target, 0, pivot-1);
    //     }
    //     return binarySearch(arr, target, pivot+1, arr.length-1);
    // }
    // static int findPivot(int[] arr) {
    //     int start = 0;
    //     int end = arr.length - 1;
    //     while (start < end) {
    //         //4 cases
    //         int mid = start + (end - start) / 2;
    //         if (mid<end && arr[mid] > arr[mid + 1]) {
    //             return mid;
    //         }
    //         if (mid>start && arr[mid] < arr[mid - 1]) {
    //             return mid-1;
    //         }
    //         //basic binary serach condition
    //         if(arr[start]>=arr[mid]){
    //             end = mid-1;
    //         }
    //         else{
    //             start = mid+1;
    //         }
    //     }
    //     return -1;
    // }
    // static int binarySearch(int[] arr, int target, int start, int end) {
    //     while (start <= end) {

    //         int mid = start + (end-start) / 2;

    //         if (arr[mid]>target){
    //             end = mid - 1;
    //         }
    //         else if (arr[mid]<target){
    //             start = mid + 1;
    //         }
    //         else{
    //             return mid;
    //         }
    //     }
    //     return -1;
    // }
}
