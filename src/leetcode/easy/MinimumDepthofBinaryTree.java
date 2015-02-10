package leetcode.easy;

import leetcode.easy.PathSum.TreeNode;

/**
 * Created by Jane on 2/10/15.
 */
public class MinimumDepthofBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode lc = new TreeNode(2);
        TreeNode rc = new TreeNode(3);
        TreeNode lclc = new TreeNode(4);

        root.left = lc;
        root.right = rc;
        lc.left = lclc;

        System.out.println("Min depth: " + minDepth(root));
    }

    public static int minDepth(TreeNode root) {
        if (root == null) return 0;
        return search(root);
    }

    public static int search(TreeNode node) {
        if (node == null) {
            return Integer.MAX_VALUE;
        }
        if (node.left == null && node.right == null)
            return 1;

        int depthLeft = search(node.left);
        int depthRight = search(node.right);

        return Math.min(depthLeft, depthRight) + 1;
    }
}
