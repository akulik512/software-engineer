package com.akulik;

import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

    private final Map<Character, Character> mappings = Map.of(
            ')', '(',
            '}', '{',
            ']', '['
    );

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If the current character is a closing bracket.
            if (mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != mappings.get(c)) return false;
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }
}
