package org.example;

public class MaxSubArrayExample {

    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); //(-5, -2-5)
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, -5, 6, -2, -3, 1, 5, -6};
        int result = maxSubArray(nums);
        System.out.println("Maximum subarray sum is: " + result);
    }
}
