package org.example.arrays;

import java.util.Arrays;

public class LC27 {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums,3);
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[k++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(Arrays.stream(nums).toArray()));

        return k;

        /*if(nums.length == 0) return 0;

        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == val){
                nums[k++] = nums[i];
            }
        }
        return k;*/
    }
}
