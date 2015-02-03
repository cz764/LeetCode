package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jane on 2/3/15.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] test = {1, 1, 1, 1, 1, 4, 4, 3, 1};

        System.out.println(majorityElement(test));
    }

    public static int majorityElement(int[] num) {
        int n = num.length;
        Map<Integer, Integer> dic = new HashMap<Integer, Integer>();

        for (int e: num) {
            if (dic.get(e) == null) dic.put(e, 1);
            else 
                dic.put(e, dic.get(e) + 1);

            if (dic.get(e) > n / 2) return e;
        }
        return 0;
    }
}
