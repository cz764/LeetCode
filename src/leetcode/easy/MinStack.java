package leetcode.easy;

import java.util.Stack;

/**
 * Created by Jane on 2/8/2015.
 */
public class MinStack {
    Stack<Integer> mins;
    Stack<Integer> stack;

    public MinStack() {
        stack = new Stack<Integer>();
        mins = new Stack<Integer>();
    }

    public void push(int x) {
        if (mins.isEmpty()) {
            mins.push(x);
            stack.push(x);
        } else {
            if (x <= mins.peek()) {
                mins.push(x);
                stack.push(x);
            } else {
                stack.push(x);
            }
        }
    }

    public void pop() {
        int x = mins.peek();
        int top = stack.peek();

        if (top == x) {
            stack.pop();
            mins.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return mins.peek();
    }

    public static void main(String[] args) {
        MinStack ms = new MinStack();
        ms.push(0);
        ms.push(1);
        ms.push(0);

        System.out.println("the min element is " + ms.getMin());
    }
}
