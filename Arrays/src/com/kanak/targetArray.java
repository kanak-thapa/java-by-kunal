package com.kanak;

import java.util.Arrays;

public class targetArray {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];

        // Initialize target array with a placeholder value (-1 or similar)
        for (int i = 0; i < target.length; i++) {
            target[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            if (target[index[i]] == -1) {
                // Place the element directly if the position is empty
                target[index[i]] = nums[i];
            }
            else {
                // Shift elements to the right to make room
                for (int j = nums.length - 1; j > index[i]; j--) {
                    target[j] = target[j - 1];
                }
                target[index[i]] = nums[i];
            }
        }
        return target;

    }
}
