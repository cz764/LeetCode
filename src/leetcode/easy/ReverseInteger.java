package leetcode.easy;

/**
 * Created by Jane on 2/8/2015.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        int a = -123;
        int b = 1534236469;
        String str = "-123";
        System.out.println(reverse(b));
    }

    public static int reverse(int x) {
        int result = 0;
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        if (sb.charAt(0) == '-') {
            sb.delete(0, 1);
            try {
                result = Integer.parseInt(sb.reverse().insert(0, '-').toString(), 10);
            } catch (NumberFormatException e) {
                return 0;
            }

        } else {
            try {
                result = Integer.parseInt(sb.reverse().toString(), 10);
            } catch (NumberFormatException e) {
                return 0;
            }

        }
        return result;
    }
}
