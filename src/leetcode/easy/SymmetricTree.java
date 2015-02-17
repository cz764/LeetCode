package leetcode.easy;

import leetcode.easy.PathSum.TreeNode;

/**
 * Created by Jane on 2/11/15.
 */
public class SymmetricTree {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        TreeNode n7 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n6;
        n3.right = n5;
        n5.right = n7;

        System.out.println("is symmentric: " + isSymmetric(n1));

    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return search(root.left, root.right);
    }

    public static boolean search(TreeNode left, TreeNode right) {
        if (left == null && right == null)
            return true;
        else if (left != null && right != null && left.val == right.val)
            return search(left.left, right.right) && search(left.right, right.left);
        else
            return false;
    }
}
