package leetcode.easy;
import leetcode.easy.PathSum.TreeNode;

/**
 * Created by Jane on 2/10/15.
 */
public class BalancedBinaryTree {
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

        System.out.println(isBalanced(n1));
        System.out.println("depth left subtree: " + findDepth(n1.left));
        System.out.println("depth right subtree: " + findDepth(n1.right));
    }

    public static boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int depthLeft = findDepth(root.left);
        int depthRight = findDepth(root.right);

        return Math.abs(depthLeft - depthRight) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int findDepth(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null)
            return 1;

        return Math.max(findDepth(node.left), findDepth(node.right))+ 1;
    }
}
