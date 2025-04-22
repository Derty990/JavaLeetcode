package org.example.arrays.medium;

public class LC11 {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while(left<right){
            int width = right-left;

            int minHeight = Math.min(height[left], height[right]);

            int currentWater = width*minHeight;

            maxWater = Math.max(maxWater, currentWater);

            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }

        }
        return maxWater;
    }
}
