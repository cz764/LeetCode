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

        System.out.println("preOrder: " + preOrder(n1));
        System.out.println("postOrder: " + postOrder(n1));
    }

    public static boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return preOrder(root).equals(postOrder(root));
    }

    public static String preOrder(TreeNode node) {
        StringBuffer sb = new StringBuffer();

        if (node != null) {
            sb.append(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }

        return sb.toString();
    }

    public static String postOrder(TreeNode node) {
        StringBuffer sb = new StringBuffer();

        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            sb.append(node.val);
        }

        return sb.toString();
    }
}
