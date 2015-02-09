package leetcode.easy;

/**
 * Created by Jane on 2/9/15.
 */
public class ValidPalindrome2 {
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
        String str2 = "race a car";
        System.out.println(str1 + " is " + isPalindrome(str1));
        System.out.println(str2 + " is " + isPalindrome(str2));
    }

    public static boolean isPalindrome(String s) {
        if (s.equals("")) return true;
        String processed = process(s);
        int length = processed.length();
        for (int i = 0; i < length / 2; i++) {
            if (processed.charAt(i) != processed.charAt(length - 1 - i))
                return false;
        }
        return true;
    }

    public static String process(String s) {
        String str = s.trim();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = Character.toLowerCase(str.charAt(i));
            if (Character.isLetterOrDigit(c)) sb.append(c);
        }
        return sb.toString();
    }
}
