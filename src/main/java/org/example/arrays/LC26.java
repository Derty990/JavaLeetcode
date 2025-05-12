package org.example.arrays;

public class LC26 {

    public static void main(String[] args) {
        int[] array = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(array);
    }

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;

        for (int i = 1; i < nums.length; i++) {

            if(nums[i] != nums[insertIndex-1]){
                nums[insertIndex++] = nums[i];
            }
        }

        return insertIndex;

        /*if(nums.length==1) return 1;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1]){
                nums[k++] = nums[i];
            }
        }
        return k;*/
    }
}