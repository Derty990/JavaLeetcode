package org.example.stacks;

import java.util.Stack;

public class LC20 {
    public static void main(String[] args) {
        String s = "([{}])";
        isValid(s);
    }

    public static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if(c=='(') stack.push(')');
            else if(c=='[') stack.push(']');
            else if(c=='{') stack.push('}');
            else if(stack.isEmpty() || stack.pop()!=c) return false;
        }
        return stack.isEmpty();
      /*
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((top != '(' && c == ')') || (top != '[' && c == ']') || (top != '{' && c == '}'))
                    return false;
            }
        }
        return stack.isEmpty();*/
    }
}
