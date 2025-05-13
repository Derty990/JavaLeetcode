package org.example.stacks;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LC496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        if(nums2.length == 0 || nums1.length == 0) return new int[0];

        Map<Integer, Integer> numberNGE = new HashMap<>();
        Stack<Integer> numStack = new Stack<>();

        numStack.push(nums2[nums2.length-1]);
        numberNGE.put(nums2[nums2.length-1], -1);

        for(int i = nums2.length-2; i>= 0; i--){
            if(nums2[i] < numStack.peek()){
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
                continue;
            }

            while(!numStack.isEmpty() && numStack.peek()<nums2[i]) numStack.pop();

            if(numStack.isEmpty()){
                numStack.push(nums2[i]);
                numberNGE.put(nums2[i], -1);
            }else{
                numberNGE.put(nums2[i], numStack.peek());
                numStack.push(nums2[i]);
            }


        }
        for(int i = 0; i< nums1.length; i++){
            nums1[i] = numberNGE.get(nums1[i]);
        }

        return nums1;

       /* HashMap<Integer, Integer> nextGreatest = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (Integer num : nums2) {
            while(!stack.isEmpty() && stack.peek()<num){
                nextGreatest.put(stack.pop(), num);
            }
            stack.push(num);
        }

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nextGreatest.getOrDefault(nums1[i], -1);
        }

        return nums1;*/

    }
}
