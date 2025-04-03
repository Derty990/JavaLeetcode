package org.example.arrays;

public class LC1470 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        shuffle(nums, 4);
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] newArr = new int[nums.length];
        var j = 0;

        for (int i = 0; i <n; i++) {
            newArr[j++] = nums[i];
            newArr[j++] = nums[i+n];
        }
    return newArr;

    }
}
