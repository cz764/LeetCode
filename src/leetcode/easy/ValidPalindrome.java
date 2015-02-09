package leetcode.easy;

/**
 * Created by Jane on 2/9/15.
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "1a2";
        System.out.println(str1 + " is " + isPalindrome(str1));
        System.out.println(str2 + " is " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer processed = process(s);
        return s.equals("") || processed.toString().equals(processed.reverse().toString());
    }

    public static StringBuffer process(String s) {
        String str = s.trim();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (Character.isLetterOrDigit(c)) sb.append(c);
        }
        return sb;
    }
}
