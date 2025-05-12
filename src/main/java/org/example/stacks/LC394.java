package org.example.stacks;

import java.util.Stack;

public class LC394 {
    public String decodeString(String s) {
        Stack<StringBuilder> stringStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int k = 0;

        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                k = k * 10 + (c-'0');
            }else if (c=='['){
                numStack.push(k);
                stringStack.push(currentString);

                currentString = new StringBuilder();
                k = 0;
            }else if(c==']'){
                int repeatTimes = numStack.pop();
                StringBuilder previousString = stringStack.pop();

                StringBuilder repeatedString = new StringBuilder();

                for (int i = 0; i < repeatTimes; i++) {
                    repeatedString.append(currentString);
                }

                currentString = previousString.append(repeatedString);
            }else{
                currentString.append(c);
            }
        }
        return currentString.toString();
    }
}
