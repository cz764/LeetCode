package leetcode.easy;

/**
 * Created by Jane on 2/8/2015.
 */
public class StringToInteger {
    public static void main(String[] args) {
        String str1 = "b11228552307";
        String str2 = "     #@!123";
        String str3 = "-2147483648";
        System.out.println(str1 + " : " + atoi(str1));
        System.out.println(str2 + " : " + Integer.parseInt(str2));
        System.out.println(str3 + " : " + atoi(str3));
    }

    public static int atoi(String str) {
        if (str.equals("")) return 0;
        String s = str.trim();
        StringBuffer sb = new StringBuffer();

        int start = findIndex(s);
        if (start == Integer.MAX_VALUE) return 0;

        int sign = start - 1;
        if (sign !=0 && sign != -1) return 0;

        char initial = sign < 0 ? s.charAt(0) : s.charAt(sign);
        if (initial == '-') sb.append(initial);
        else if (!Character.isDigit(initial) && initial != '+') return 0;

        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) sb.append(c);
            else break;
        }
        if (sb.length() == 0) return 0;

        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            if (initial == '-') return Integer.MIN_VALUE;
            return Integer.MAX_VALUE;
        }
    }

    public static int findIndex(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return i;
            }
        }
        return Integer.MAX_VALUE;
    }
}
