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

    public static String getTitle(int c) {
        switch (c) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 5:
                return "E";
            case 6:
                return "F";
            case 7:
                return "G";
            case 8:
                return "H";
            case 9:
                return "I";
            case 10:
                return "J";
            case 11:
                return "K";
            case 12:
                return "L";
            case 13:
                return "M";
            case 14:
                return "N";
            case 15:
                return "O";
            case 16:
                return "P";
            case 17:
                return "Q";
            case 18:
                return "R";
            case 19:
                return "S";
            case 20:
                return "T";
            case 21:
                return "U";
            case 22:
                return "V";
            case 23:
                return "W";
            case 24:
                return "X";
            case 25:
                return "Y";
            case 0:
                return "Z";
            default:
                return "";
        }
    }
}
