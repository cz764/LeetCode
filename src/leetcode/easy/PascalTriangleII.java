package leetcode.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jane on 2/9/15.
 */
public class PascalTriangleII {
    public static void main(String[] args) {
        int row = 3;
        System.out.println(getRow(row));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<Integer>(rowIndex + 1);
        for (int i = 0; i <= rowIndex; i++) {
            list.add(0);
        }

        list.set(0, 1);
        for (int i = 0; i <= rowIndex; i++) {
            for (int j = i; j > 0; j--) {
                list.set(j, list.get(j) + list.get(j - 1));
            }
        }
        return list;
    }
}
