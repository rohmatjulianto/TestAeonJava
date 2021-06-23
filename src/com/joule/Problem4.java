package com.joule;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

public class Problem4 {
    public static void main(String[] args) {

        String s = "{[()()]}";
        System.out.println(solution(s));
    }

    public static boolean solution(String S){
        Deque<Character> stack = new ArrayDeque<Character>();

        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            switch (c) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return true;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return true;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return true;
                    break;
                default:
                    stack.push(c);
                    break;
            }
        }

        return stack.isEmpty();
    }
}
