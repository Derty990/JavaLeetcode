package org.example.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC448 {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> dissapeared = new ArrayList<>();
        int n = nums.length;

        boolean[] present = new boolean[n+1];

        for(int num : nums){
            present[num] = true;
        }

        for (int i = 1; i<=n; i++){
            if(!present[i]){
                dissapeared.add(i);
            }
        }

        return dissapeared;
    }
}
