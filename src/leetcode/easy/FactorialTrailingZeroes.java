package leetcode.easy;

/**
 * Created by Jane on 2/9/15.
 */
public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int n3 = 1808548329;

        System.out.println("trailing zeros for factorial " + n1 + " is " + trailingZeroes(n1));
        System.out.println("trailing zeros for factorial " + n2 + " is " + trailingZeroes(n2));
        System.out.println("trailing zeros for factorial " + n3 + " is " + trailingZeroes(n3));
    }

    public static int trailingZeroes(int n) {
        if (n == 0) return 0;
        int count = 0;

        while (n > 0) {
            n = n / 5;
            count += n;
        }

        return count;
    }
}
