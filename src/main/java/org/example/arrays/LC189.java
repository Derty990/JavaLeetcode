package org.example.arrays;

public class LC189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i+k) % n] = nums[i];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }

    }
}
