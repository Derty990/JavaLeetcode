package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LC169 {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();
        int n = nums.length;

        for (int num : nums){
            counts.put(num, counts.getOrDefault(num, 0) + 1);

            if(counts.get(num) > n/2){
                return num;
            }
        }

        return -1;
    }
}
