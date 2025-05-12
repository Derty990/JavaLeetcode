package org.example.arrays.medium;

public class LC53 {
    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];
        int currSum = 0;

        for (int num : nums) {
            currSum = Math.max(currSum, 0);
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;

       /* int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere+nums[i]);

            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;*/
    }
}
