package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Jane on 2/4/15.
 */
public class PathSum {
    static class TreeNode {
        int val;
        TreeNode left = null;
        TreeNode right = null;
        TreeNode(int x) { val = x; }
    }

     public static void main(String[] args) {
//         TreeNode root = new TreeNode(5);
//         TreeNode l2l = new TreeNode(4);
//         TreeNode l2r = new TreeNode(8);
//         root.left = l2l;
//         root.right = l2r;
//
//         TreeNode l2ll = new TreeNode(11);
//         TreeNode l2rl = new TreeNode(13);
//         TreeNode l2rr = new TreeNode(4);
//
//         l2l.left = l2ll;
//         l2r.left = l2rl;
//         l2r.right = l2rr;
//
//         TreeNode leef1 = new TreeNode(7);
//         TreeNode leef2 = new TreeNode(2);
//         TreeNode leef3 = new TreeNode(1);
//
//         l2ll.left = leef1;
//         l2ll.right = leef2;
//         l2rr.right = leef3;


         TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         int sum = 1;

         System.out.println("The tree is " + hasPathSum(root, sum));
    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        Set<Integer> set = sum(root);

        for (int i: set) {
            System.out.println("possible path sum is " + i);
        }
        return set.contains(sum);
    }
    public static Set<Integer> sum(TreeNode node) {
        if (node.left == null && node.right == null) {
            Set<Integer> s = new HashSet<Integer>();
            s.add(node.val);
            return s;
        }
        Set<Integer> left = null;
        Set<Integer> right = null;

        if (node.left != null) left = sum(node.left);
        if (node.right != null) right = sum(node.right);

        Set<Integer> joined = new HashSet<Integer>();
        if (left != null) joined.addAll(left);
        if (right != null) joined.addAll(right);

        Set<Integer> result = new HashSet<Integer>();

        for (int i: joined) {
            result.add(i + node.val);
        }
        return result;
    }
}
