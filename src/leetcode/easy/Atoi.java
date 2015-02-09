package leetcode.easy;

/**
 * Created by Jane on 2/8/2015.
 */
public class Atoi {
    public static void main(String[] args) {
        String str1 = "b11228552307";
        String str2 = "     #@!123";
        String str3 = "-2147483648";
        System.out.println(str1 + " : " + atoi(str1));
        System.out.println(str2 + " : " + atoi(str2));
        System.out.println(str3 + " : " + atoi(str3));
    }

    public static int atoi(String str) {
        str=str.trim();
        long result = 0;
        int i = 0;
        boolean flag = false;
        if(str.equals(""))
            return 0;
        if(str.charAt(0) == '-'){
            flag = true;
            i++;
        }
        if(str.charAt(0) == '+')
            i++;
        for(; i < str.length(); i++){
            if(str.charAt(i) > '9' || str.charAt(i) < '0')
                break;
            int a = (int)(str.charAt(i) - '0');
            result = result*10 + a;
            if(result > 0x7fffffff){
                if(flag)
                    return 0x7fffffff * -1 - 1;
                else
                    return 0x7fffffff;
            }
        }
        if(flag)
            return (int)result * -1;
        else
            return (int)result;
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
