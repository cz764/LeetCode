package leetcode.easy;

/**
 * Created by Jane on 2/6/15.
 */
public class CompareVersionNumbers {
    public static void main(String[] args) {
        System.out.println("0.1 and 0.0.1 " + compareVersion("0.1", "0.0.1"));
        System.out.println("1.3 and 1.2 " + compareVersion("1.3", "1.2"));
        System.out.println("1.1 and 1.1 " + compareVersion("1.1", "1.1"));
    }

    public static int compareVersion(String version1, String version2) {
        String delimiter = "\\.";
        String[] v1 = version1.trim().split(delimiter);
        String[] v2 = version2.trim().split(delimiter);

        for (int i = 0; i < (v1.length > v2.length ? v1.length : v2.length); i++) {
//            System.out.println("v1[" + i + "] : " + v1[i]);
//            System.out.println("v2[" + i + "] : " + v2[i]);
            int before;
            int after;

            if (i >= v1.length) return -1;
            else before = Integer.parseInt(v1[i].trim());
            if (i >= v2.length) return 1;
            else after = Integer.parseInt(v2[i].trim());

//            System.out.println(i + " digit before: " + before + " after : " + after);
            if (before < after) return -1;
            if (before > after) return 1;
        }
        return 0;
    }
}
