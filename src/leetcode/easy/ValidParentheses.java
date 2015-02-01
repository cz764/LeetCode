package leetcode.easy;

import java.util.Stack;

/**
 * Created by Jane on 1/31/2015.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()]"));
    }

    public static boolean isValid(String s) {
        Stack stack = new Stack();
        char[] parentheses = s.toCharArray();

        for (char p : parentheses) {
            if (p == '(' || p == '[' | p == '{') stack.push(p);
            else {
                if (p == ')') {
                    if (stack.empty()) return false;
                    if (!stack.peek().equals('(')) return false;
                    stack.pop();
                }
                if (p == ']') {
                    if (stack.empty()) return false;
                    if (!stack.peek().equals('[')) return false;
                    stack.pop();
                }
                if (p == '}') {
                    if (stack.empty()) return false;
                    if (!stack.peek().equals('{')) return false;
                    stack.pop();
                }
            }
        }

        return stack.empty();
    }
}
