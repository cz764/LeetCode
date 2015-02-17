package leetcode.easy;

/**
 * Created by Jane on 2/16/2015.
 */
public class CountAndSay {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        if (n == 0) return "";
        String prev = "1";

        while (--n > 0) {
            StringBuilder cur = new StringBuilder();
            int count = 0;

            for (int j = 0; j < prev.length(); j++) {
                if (j == 0 || prev.charAt(j) == prev.charAt(j - 1)) {
                    count++;
                } else {
                    cur.append(String.valueOf(count));
                    cur.append(prev.charAt(j - 1));
                    count = 1;
                }
            }
            cur.append(String.valueOf(count));
            cur.append(prev.charAt(prev.length() - 1));
            prev = cur.toString();
        }
        return prev;
    }
}
