package org.example.arrays;

import java.util.*;

public class LC628 {
    public int maximumProduct(int[] nums) {
        int fm = Integer.MIN_VALUE;
        int sm = fm;
        int tm = fm;

        int fs = Integer.MAX_VALUE;
        int ss = fs;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >= fm){
                tm = sm;
                sm=fm;
                fm = nums[i];
            }else if(nums[i] >= sm){
                tm=sm;
                sm=nums[i];
            }else if(nums[i] >= tm){
                tm = nums[i];
            }

            if(nums[i] <= fs ){
                ss = fs;
                fs = nums[i];
            }else if(nums[i] <= ss){
                ss = nums[i];
            }

        }
        return Math.max(fm*sm*tm, fs*ss*fm);


    }
}
