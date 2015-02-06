package leetcode.easy;

/**
 * Created by Jane on 2/5/15.
 */
public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
//        System.out.println("1 : " + convertToTitle(1));
//        System.out.println("27 : " + convertToTitle(27));
//        System.out.println("111 : " + convertToTitle(111));
//        System.out.println("1024 : " + convertToTitle(1024));
        System.out.println("52: " + convertToTitle(52));
    }

    public static String convertToTitle(int n) {
        if (n == 0) return "";

        StringBuffer b = new StringBuffer();
        while (n > 0) {
            int rem = (n - 1) % 26;
            b.append((char)(rem + 'A'));
            n = (n - 1) / 26;
        }
        return b.reverse().toString();
    }
}
