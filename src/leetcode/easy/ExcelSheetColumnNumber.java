package leetcode.easy;

/**
 * Created by Jane on 2/2/15.
 */
public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String value1 = "A";
        System.out.println(Integer.parseInt(value1, 16));

        System.out.printf("AA: %d%n", titleToNumber("AA"));
        System.out.printf("BA: %d%n", titleToNumber("BA"));
        System.out.printf("BAZ: %d%n", titleToNumber("BAZ"));
    }

    public static int titleToNumber(String s) {
        int sum = 0;
        int len = s.length() - 1;

        char[] columns = s.toCharArray();

        for (char c: columns) {
            int v = getValue(c);

            sum +=  v * Math.pow(26, len--);
        }

        return sum;
    }

    public static int getValue(char c) {
        switch (Character.toUpperCase(c)) {
            case 'A': return 1;
            case 'B': return 2;
            case 'C': return 3;
            case 'D': return 4;
            case 'E': return 5;
            case 'F': return 6;
            case 'G': return 7;
            case 'H': return 8;
            case 'I': return 9;
            case 'J': return 10;
            case 'K': return 11;
            case 'L': return 12;
            case 'M': return 13;
            case 'N': return 14;
            case 'O': return 15;
            case 'P': return 16;
            case 'Q': return 17;
            case 'R': return 18;
            case 'S': return 19;
            case 'T': return 20;
            case 'U': return 21;
            case 'V': return 22;
            case 'W': return 23;
            case 'X': return 24;
            case 'Y': return 25;
            case 'Z': return 26;
            default: return 0;
        }
    }
}
