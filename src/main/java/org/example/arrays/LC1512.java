package org.example.arrays;

public class LC1512 {
    public int numIdenticalPairs(int[] nums) {
        int[] counts = new int[101];

        int totalGoodPairs = 0;

        for (int num : nums) {
            totalGoodPairs+=counts[num];
            counts[num]++;
        }

        return totalGoodPairs;
    }
}
