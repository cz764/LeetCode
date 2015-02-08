package leetcode.easy;

import java.math.BigInteger;
import java.util.Stack;

/**
 * Created by Jane on 2/8/2015.
 */
public class ReverseInteger2 {
    public static void main(String[] args) {
        int a = -123;
        int b = 1534236469;
        String str = "-123";
        System.out.println(reverse(-b));
    }

    public static int reverse(int x) {
        int n = Math.abs(x);
        Stack<Integer> stack = new Stack<Integer>();

        while (n > 0) {
            int r = n % 10;
            stack.push(r);
            n /= 10;
        }
        try {
            int count = 0;
            int sum = 0;
            while (!stack.isEmpty()) {
                int digit = stack.pop();
                int decimal = (int)(digit * Math.pow(10, count++));
                sum = Math.addExact(sum, decimal);
            }
            return x >= 0 ? sum : -sum;
        } catch (ArithmeticException e) {
            return 0;
        }
    }
}
