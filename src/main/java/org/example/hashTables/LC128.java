package org.example.hashTables;

import java.util.HashMap;
import java.util.Map;

public class LC128 {
    public int longestConsecutive(int[] nums) {
        int longestLength = 0;
        Map<Integer, Boolean> exploredMap = new HashMap<>();

        for (int num : nums) {
            exploredMap.put(num, false);
        }

        for (int num : nums) {
            int currentLength = 1;

            int nextNum = num+1;
            while(exploredMap.containsKey(nextNum) && !exploredMap.get(nextNum)){
                currentLength++;
                exploredMap.put(nextNum, Boolean.TRUE);

                nextNum++;
            }

            int prevNum = num-1;
            while(exploredMap.containsKey(prevNum) && !exploredMap.get(prevNum)){
                currentLength++;
                exploredMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }

            longestLength = Math.max(longestLength, currentLength);

        }

        return longestLength;

    }
}
