package leetcode.easy;

/**
 * Created by Jane on 2/8/2015.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        int n1 = 1234321;
        int n2 = 123443;

        System.out.println(n1 + " is " + isPalindrome(n1));
        System.out.println(n2 + " is " + isPalindrome(n2));
    }

    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        String reversed = sb.reverse().toString();
        try {
            System.out.println("reversed: " + reversed);
            return Integer.parseInt(reversed) == x;
        } catch (RuntimeException e) {
            return false;
        }
    }
}
