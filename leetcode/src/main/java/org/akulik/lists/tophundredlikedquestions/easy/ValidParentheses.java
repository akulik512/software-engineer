package org.akulik.lists.tophundredlikedquestions.easy;

import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String parentheses) {
        Stack<Character> stack = new Stack<>();

        char[] array = parentheses.toCharArray();
        for (char character : array) {
            switch (character) {
                case '(', '{', '[' -> stack.push(character);
                case ')' -> {
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                }
                case '}' -> {
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                }
                case ']' -> {
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                }
                default -> throw new IllegalStateException("Unexpected value: " + character);
            }
        }

        return stack.isEmpty();
    }

}
