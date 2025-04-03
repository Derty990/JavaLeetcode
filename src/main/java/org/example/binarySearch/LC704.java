package org.example.binarySearch;

public class LC704 {
    public int search(int[] nums, int target) {

        if(nums.length<1) return nums[0];

        //[1,3,3,4,5,6,7,8]
        //L = 0, R = 8
        int L = 0, R = nums.length-1;
        int mid;

        while(L <= R){
            mid = (L+R)/2;

            if(target < nums[mid]){
                R = mid - 1;
            }else if(target > nums[mid]){
                L = mid + 1;
            }else{
                return mid;
            }
        }

        return -1;

    }
}
