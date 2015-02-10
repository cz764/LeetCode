package leetcode.easy;

import leetcode.easy.PathSum.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jane on 2/10/15.
 */
public class BinaryTreeLevelOrderTraversalII {
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

        System.out.println("The traversal is : " + levelOrderBottom(n1));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return Collections.emptyList();

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<TreeNode> curr = new ArrayList<TreeNode>();
        curr.add(root);

        while (!curr.isEmpty()) {
            List<TreeNode> next = new ArrayList<TreeNode>();
            List<Integer> row = new ArrayList<Integer>();

            for (TreeNode node: curr) {
                if (node.left != null)
                    next.add(node.left);
                if (node.right != null)
                    next.add(node.right);
                row.add(node.val);
            }

            list.add(0, row);
            curr = next;
        }
        return list;
    }
}
