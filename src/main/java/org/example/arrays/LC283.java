package org.example.arrays;

import java.util.Arrays;

public class LC283 {
    public static void main(String[] args) {
        moveZeroes(new int[]{4,2,4,0,0,3,0,5,1,0});
    }
    public static void moveZeroes(int[] nums) {

        int n =nums.length;
        int nonZeroIndex = 0;

        for (int i = 0; i < n; i++) {
            if(nums[i]!=0){
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while(nonZeroIndex<n){
            nums[nonZeroIndex++] = 0;
        }

      /*
        int n = nums.length;
        int nonZeroIndex = 0;
        for (int i = 0; i < n; i++) {
            if(nums[i]!=0){
                nums[nonZeroIndex++] = nums[i];
            }
        }

        while(nonZeroIndex < n){
            nums[nonZeroIndex++] = 0;
        }*/


        /*int n = nums.length;
        int[] result = new int[n];
        int zerosCount = 0;
        int nonZeroIndex = 0;
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < n; i++) {
            if(nums[i] != 0){
                result[nonZeroIndex++] = nums[i];
            }
        }
        System.out.println("Before adding 0: "+Arrays.toString(result));

       if(zerosCount>0){
           for (int i = nonZeroIndex; i < n; i++) {
               result[i] = 0;
           }
       }
        System.out.println("after adding 0: "+Arrays.toString(result));


        for (int i = 0; i < n; i++) {
            nums[i] = result[i];
        }

        System.out.println(Arrays.toString(result));*/



    }
}
