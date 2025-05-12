package org.example.arrays;

public class LC35 {

    public int searchInsert(int[] nums, int target) {
        int n = nums.length / 2;
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high-low)/2;

            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;

    }


}
