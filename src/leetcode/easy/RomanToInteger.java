package leetcode.easy;

/**
 * Created by Jane on 2/8/2015.
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String r1 = "MCMXCVI";
        System.out.println(r1 + " is " + romanToInt(r1));
    }

    public static int romanToInt(String s) {
        int sum = 0;
        for (char c: s.toCharArray()) {
            sum += getValue(c);
        }

        for (int i = 0; i < s.length(); i++) {
            String pattern = s.substring(i, i + 2 < s.length() ? i + 2 : s.length());
            if (pattern.equals("IV") || pattern.equals("IX")) sum -= 2;
            if (pattern.equals("XL") || pattern.equals("XC")) sum -= 20;
            if (pattern.equals("CD") || pattern.equals("CM")) sum -= 200;
        }
        return sum;
    }

    public static int getValue (char c) {
        switch (Character.toUpperCase(c)) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
