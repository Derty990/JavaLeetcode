package org.example.stacks;

import java.util.Stack;

public class LC1249 {
    public String minRemoveToMakeValid(String s) {

        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < sb.length(); ++i) {
            if(sb.charAt(i) == '(') st.add(i);
            if(sb.charAt(i) == ')'){
                if(!st.isEmpty()) st.pop();
                else sb.setCharAt(i, '*');
            }
        }

        while(!st.isEmpty())
            sb.setCharAt(st.pop(), '*');
            return sb.toString().replaceAll("\\*", "");

       /* StringBuilder sb = new StringBuilder();
        int open = 0;

        for (char c : s.toCharArray()){
            if(c == '('){
                open++;
            }else if (c==')'){
                if(open == 0) continue;
                open--;
            }

            sb.append(c);
        }

        StringBuilder result = new StringBuilder();
        for (int i = sb.length()-1; i>=0; i--){
            if(sb.charAt(i)=='(' && open-- > 0) continue;
            result.append(sb.charAt(i));
        }

        return result.reverse().toString();*/

    }
}
