package org.example.arrays.medium;

import java.util.HashSet;
import java.util.Set;

public class LC287 {
    public int findDuplicate(int[] nums) {
/*
        int slow = 0, fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }return slow;*/

        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num))
                return num;
            numSet.add(num);
        }

        return -1;

    }
}
