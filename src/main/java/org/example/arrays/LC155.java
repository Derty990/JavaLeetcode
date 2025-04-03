package org.example.arrays;

import java.util.Stack;

public class LC155 {
    Stack<Integer> stack;
    Stack<Integer> minStack;

    public LC155() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        stack.push(val);
        int min = val;
        if(!minStack.isEmpty()){
            min = Math.min(min, minStack.peek());
            minStack.push(min);
        }else{
            minStack.push(min);
        }

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
