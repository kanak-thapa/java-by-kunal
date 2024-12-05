package com.kanak;

public class richestWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,6},
                {3,2,1}
        };
        int ans = richestCustWealth(arr);
        System.out.println(ans);
    }

    static int richestCustWealth(int[][] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
