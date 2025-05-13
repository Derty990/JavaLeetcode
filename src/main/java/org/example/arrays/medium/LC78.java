package org.example.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC78 {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(result, new ArrayList<>(), nums, 0);
        return result;

    }

    private void backtrack(List<List<Integer>> result, ArrayList<Integer> tempSet, int[] nums, int start) {

        result.add(new ArrayList<>(tempSet));
        for (int i = start; i < nums.length; i++) {
            tempSet.add(nums[i]);

            backtrack(result, tempSet, nums, i+1);

            tempSet.removeLast();
        }

    }
}
