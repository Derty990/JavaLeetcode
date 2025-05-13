package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LC136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        for (Map.Entry<Integer, Integer> integerIntegerEntry : map.entrySet()) {
            if(integerIntegerEntry.getValue() == 1) return integerIntegerEntry.getKey();
        }
        return 0;
    }
}
