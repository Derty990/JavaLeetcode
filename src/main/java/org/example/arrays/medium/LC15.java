package org.example.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int target = -nums[i];
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                int sum = nums[left] + nums[right];

                if (sum < target) {
                    left++;
                } else if (sum > target) {
                    right--;
                } else {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    int leftVal = nums[left];
                    int rightVal = nums[right];

                    left++;
                    right--;

                    while (left < right && nums[left] == leftVal) {
                        left++;
                    }

                    while (left < right && nums[right] == rightVal) {
                        right--;
                    }
                }
            }
        }
        return result;
    }

}
