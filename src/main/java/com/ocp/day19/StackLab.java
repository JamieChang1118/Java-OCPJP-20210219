package com.ocp.day19;

import java.util.Stack;

/**
 * 說明: 使用者輸入 "Java" 則會顯示 "avaJ"
 * @author boddy
 */

public class StackLab {
    public static void main(String[] args) {
        String s = "java";
        char[] array = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(char c : array) {
            stack.push(c);
        }
        while (!stack.isEmpty()) {            
            System.out.print(stack.pop());
        }
    }
}
