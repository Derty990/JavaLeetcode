package org.example.hashTables;

import java.util.HashMap;
import java.util.Map;

public class LC560 {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSumCount = new HashMap<>();

        prefixSumCount.put(0,1);

        int count = 0;
        int currentSum = 0;

        for (int num : nums){
            currentSum+=num;

            if(prefixSumCount.containsKey(currentSum-k)){
                count+=prefixSumCount.get(currentSum-k);
            }

            prefixSumCount.put(currentSum, prefixSumCount.getOrDefault(currentSum,0)+1);
        }
        return count;
    }
}
