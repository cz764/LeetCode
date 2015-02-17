package leetcode.easy;

/**
 * Created by Jane on 2/13/15.
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 4, 3, 3};
        int[] a2 = {};
        int val = 3;

        System.out.println("remove " + val + " from " + a1 + " results in " +
                removeElement(a1, val));
        System.out.println("remove " + val + " from " + a2 + " results in " +
                removeElement(a2, val));
    }

    public static int removeElement(int[] A, int elem) {
        int next = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] != elem)
                A[next++] = A[i];
        }
        return next;
    }
}
