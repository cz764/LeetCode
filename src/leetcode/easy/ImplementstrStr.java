package leetcode.easy;

/**
 * Created by Jane on 2/16/2015.
 */
public class ImplementstrStr {
    public static void main(String[] args) {
        String hayStack = "JavaScript has a feature known as implied globals. Whenever a name is used, the interpreter walks the scope chain backwards looking for a var statement for that name. If none is found, that variable is assumed to be global. If it’s used in an assignment, the global is created if it doesn’t already exist. This means that using or creating global variables in an anonymous closure is easy. Unfortunately, this leads to hard-to-manage code, as it’s not obvious (to humans) which variables are global in a given file.";
        String needle = "name";

        System.out.println(strStr(hayStack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (needle.isEmpty()) return 0;
        if (haystack.isEmpty() || needle.isEmpty()) return -1;
        for(int i = 0; ; i++) {
            for(int j = 0; ; j++) {
                if (j == needle.length()) return i;
                if (i + j == haystack.length()) return -1;
                if (haystack.charAt(i + j) != needle.charAt(j)) break;
            }
        }
    }
}
