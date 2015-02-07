package leetcode.easy;

/**
 * Created by Jane on 2/7/15.
 */
public class ZigZagConversion {
    public static void main(String[] args) {
        String str = "ynsrwgnamvqjiblomuqlcjnkloygvsytfqneycglxwwfyhtkdmxhvlujbspwln";
        System.out.println(convert(str, 61));
        System.out.println(str.length());
    }

    public static String convert(String s, int nRows) {
        if (nRows <= 1) return s;

        int period = 2 * (nRows - 1);
        int len = s.length();
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < nRows; i++) {
            int j = i;
            int inc = period - 2 * i;
//            System.out.print("row " + j + ":");
            while (j < len) {
                sb.append(s.charAt(j));
//                System.out.print(" Appending " + j);
                j += (i > 0 && i < nRows - 1) ? inc: period;
                inc = period - inc;
            }
//            System.out.println();
        }
        return sb.toString();
    }
}
