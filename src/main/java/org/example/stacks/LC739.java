package org.example.stacks;

import java.util.Stack;

public class LC739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();

        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = n-1; i >= 0; i--) {
            while(!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]){
                stack.pop();
            }

            if(!stack.isEmpty()){
                result[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return result;
    }
}
