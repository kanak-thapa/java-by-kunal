package com.kanak;

public class richestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 4, 5}
        };
        int answer = richestCustomerWealthofArray(accounts);
        System.out.println(answer);
    }

    private static int richestCustomerWealthofArray(int[][] accounts) {
        int ans = 0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans = sum;
            }
        }
        return ans;
    }
}
