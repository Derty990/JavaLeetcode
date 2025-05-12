package org.example.arrays.medium;

public class LC152 {
    public int maxProduct(int[] nums) {

        int n = nums.length;
        int leftProduct = 1;
        int rightProduct = 1;
        int maxSum = nums[0];

        for (int i = 0; i < n; i++) {

            leftProduct = leftProduct == 0 ? 1 : leftProduct;
            rightProduct = rightProduct == 0 ? 1 : rightProduct;

            leftProduct *= nums[i];
            rightProduct *= nums[n-1-i];

            maxSum = Math.max(maxSum, Math.max(leftProduct, rightProduct));

        }

        return maxSum;

    }
}
