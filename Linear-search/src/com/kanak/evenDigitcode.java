package com.kanak;

public class evenDigitcode {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7869};
        System.out.println(evenNumCount(arr));
    }

     static int evenNumCount(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(even(num)){
                count++;
            }
        }
        return count;
     }

     static boolean even(int num) {
        int evenDigit = result(num);
        return evenDigit % 2==0;

    }

    private static int result(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int digit = 0;
        while(num>0){

            num = num/10;
            digit++;
        }
        return digit;
    }
}
