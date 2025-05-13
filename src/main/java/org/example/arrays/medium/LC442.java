package org.example.arrays.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LC442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();
        Set<Integer> uniqueSet = new HashSet<>();
        for (int num : nums) {
            if (uniqueSet.contains(num))
                resultSet.add(num);
            uniqueSet.add(num);
        }

        return resultSet;
    }
}
