package org.example.arrays;

import java.util.Stack;

public class LC682 {
    public static void main(String[] args) {
        String[] operations = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(operations));
    }

    public static int calPoints(String[] operations) {
        Stack<String> stack = new Stack<>();
        int result = 0;
        String pop, peek;

        for (String s : operations) {
            switch (s) {
                case "+":
                    pop = stack.pop();
                    peek = stack.peek();
                    stack.push(pop);
                    int i1 = Integer.parseInt(peek) + Integer.parseInt(pop);
                    result += i1;
                    stack.push(String.valueOf(i1));

                    break;

                case "D":
                    peek = stack.peek();
                    int i = Integer.parseInt(peek) * 2;
                    result+=i;
                    stack.push(String.valueOf(i));


                    break;

                case "C":
                    pop = stack.pop();
                    result -= Integer.parseInt(pop);

                    break;

                default:
                    stack.push(s);
                    result += Integer.parseInt(stack.peek());
            }
        }
        return result;

    }
}
