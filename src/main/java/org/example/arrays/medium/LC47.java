package org.example.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LC47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums, boolean[] used) {

        if(tempList.size() == nums.length && !resultList.contains(tempList)){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i]) continue;

            used[i] = true;

            tempList.add(nums[i]);

            backtrack(resultList, tempList, nums, used);

            used[i] = false;
            tempList.removeLast();
        }

    }
}
