package leetcode.easy;
import leetcode.easy.PathSum.TreeNode;

/**
 * Created by Jane on 2/10/15.
 */
public class MaximumDepthofBinaryTree {
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

        System.out.println("Max depth of this tree is: " + maxDepth(n1));
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return search(root);
    }

    public static int search(TreeNode node) {
        if (node == null) return 0;
        return Math.max(search(node.left), search(node.right)) + 1;
    }
}
