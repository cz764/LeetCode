package leetcode.easy;

/**
 * Created by Jane on 2/9/15.
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"Jane", "Janemm", "Janeff", "Janemiemie"};
        String[] test = {"aac","acab","aa","abba","aa"};
        System.out.println("The lcs is : " + longestCommonPrefix(test));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length <= 1) return strs[0];
        if (strs.length == 0) return "";
        int min_index = 0;
        for (int i = 0; i < strs.length; i++) {
            if (strs[min_index].length() > strs[i].length()) min_index = i;
        }

        String min = strs[min_index];
        StringBuffer sb = new StringBuffer("");
        System.out.println("min index: " + min_index);
        for (int i = 0; i < strs.length; i++) {
            if (strs[min_index] == "" || strs[min_index].charAt(0) != strs[i].charAt(0))
                return "";
            if (i != min_index) {
                int length = 1;
                for (; length <= strs[min_index].length(); length++) {
                    if (strs[min_index].substring(0, length).equals(strs[i].substring(0, length)))
                        sb = new StringBuffer(strs[min_index].substring(0, length));
                }
                if (sb.length() < min.length()) min = sb.toString();
            }
        }
        return min;
    }
}
