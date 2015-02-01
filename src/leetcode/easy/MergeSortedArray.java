package leetcode.easy;

/**
 * Created by Jane on 2/1/2015.
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int m = 4;
        int n = 4;
        int[] A = new int[]{1, 3, 5, 7, 0, 0, 0, 0};
        int[] B = {2, 4, 6, 8};

        merge(A, m, B, n);
        for (int a: A) System.out.println(a);
    }

    public static void merge(int A[], int m, int B[], int n) {
        int ar = 0;
        int br = 0;
        int p = 0;
        int[] AA = new int[m];

        for(int i = 0; i < m; i++) AA[i] = A[i];

        while(ar < m && br < n) {
            if (AA[ar] < B[br]) A[p++] = AA[ar++];
            else A[p++] = B[br++];
        }
        if (ar < m) while(ar < m) { A[p++] = AA[ar++]; }
        if (br < n) while(br < n) { A[p++] = B[br++]; }
    }
}
