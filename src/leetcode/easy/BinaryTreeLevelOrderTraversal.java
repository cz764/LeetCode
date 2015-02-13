package leetcode.easy;

import leetcode.easy.PathSum.TreeNode;

import java.util.*;

/**
 * Created by Jane on 2/11/15.
 */
public class BinaryTreeLevelOrderTraversal {
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

        System.out.println("Level Order is: " + levelOrder(n1));
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return Collections.emptyList();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        TreeNode marker = new TreeNode(0);

        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> row = new ArrayList<Integer>();

        queue.add(root);
        queue.add(marker);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == marker) {
                System.out.println("row going to add: " + row);
                list.add(row);
                System.out.println("after adding: " + list);
                if (queue.peek() != null) queue.add(node);
                row = new ArrayList<Integer>();
            } else {
                row.add(node.val);
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return list;
    }
}
