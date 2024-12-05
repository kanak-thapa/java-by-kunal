package com.kanak;

public class SearchinginMountaion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6, 7, 4, 3, 2};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
    }
    static int search(int[] arr, int target) {
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        //try finding in other part
        return orderAgnosticBS(arr, target, peak, arr.length - 1);
    }
    static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in decreasing part of array
                // this may be the answer, but look at the left
                //this is why end != mid-1
                end = mid;
            }
            else{
                //you are in the asc part of the array
                start = mid + 1;//beacause we know that mid+1 is greater than mid elem
            }
        }
        //in the end start == end and pointing to the largest element
        //start and end are always finding trying to fiind the max element in the abouve 2 checks
        //hence, when thet are pointing to just one element, that is the max one because
        //that us what the check say
        //more elaboration: at every point of time for start, they have the best possible answer till that time
        //and if we are saying that only one time is remaining hence cuz of above line
        return arr[start];//or return end as both are equal

    }
    static int orderAgnosticBS(int[] arr, int targate, int start, int end) {
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


