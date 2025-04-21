package org.example.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LC217 {
    public boolean containsDuplicate(int[] nums) {
        boolean duplicate = false;
        Set<Integer> set = new HashSet<>();

        for (int a : nums){
            duplicate = set.add(a);
            if(!duplicate) return true;

        }

        return false;

    }
}
