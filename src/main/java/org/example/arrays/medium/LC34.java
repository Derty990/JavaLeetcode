package org.example.arrays.medium;

public class LC34 {
    public int[] searchRange(int[] nums, int target) {

        int left = findLeftBound(nums,target);
        int right = findRightBound(nums,target);
        return new int[]{left, right};

        /*int[] result = {-1, -1};

        result[0] = findFirst(nums,target);

        if(result[0] == -1){
            return result;
        }

        result[1] = findLast(nums, target);

        return result;*/
    }

    private int findRightBound(int[] nums, int target) {

        int index = -1;
        int low = 0;
        int high = nums.length-1;

        while(low<=high){
            int mid = low + (high-low) /2;

            if(nums[mid] == target){
                index = mid;
                low = mid+1;
            }else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return index;

    }

    private int findLeftBound(int[] nums, int target) {

        int index = -1;
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high-low) /2;

            if(nums[mid] == target){
                index = mid;
                high = mid-1;
            }else if(nums[mid] < target) low = mid+1;
            else high = mid-1;
        }
        return index;

    }

    /*private int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int firstPosition = -1;

        while (left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target) {
                firstPosition = mid;
                right = mid-1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return firstPosition;

    }

    private int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int lastPosition = -1;

        while(left<=right){
            int mid = left + (right-left)/2;

            if(nums[mid] == target){
                lastPosition = mid;
                left = mid+1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return lastPosition;

    }*/
}
