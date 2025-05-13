package org.example.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class LC46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();

        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    private void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {

        if(tempList.size() == nums.length){
            resultList.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {
            if(tempList.contains(num)) continue;
            tempList.add(num);

            backtrack(resultList, tempList, nums);

            tempList.removeLast();
        }

    }
}
