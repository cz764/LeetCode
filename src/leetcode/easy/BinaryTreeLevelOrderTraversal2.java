package leetcode.easy;

import java.util.Collections;
import java.util.List;

/**
 * Created by Jane on 2/11/15.
 */
public class BinaryTreeLevelOrderTraversal2 {
    public static void main(String[] args) {
        PathSum.TreeNode n1 = new PathSum.TreeNode(1);
        PathSum.TreeNode n2 = new PathSum.TreeNode(2);
        PathSum.TreeNode n3 = new PathSum.TreeNode(3);
        PathSum.TreeNode n4 = new PathSum.TreeNode(4);
        PathSum.TreeNode n5 = new PathSum.TreeNode(5);
        PathSum.TreeNode n6 = new PathSum.TreeNode(6);
        PathSum.TreeNode n7 = new PathSum.TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n4.left = n6;
        n3.right = n5;
        n5.right = n7;

        System.out.println("Level Order is: " + levelOrder(n1));
    }

    public static List<List<Integer>> levelOrder(PathSum.TreeNode root) {
        if (root == null) return Collections.emptyList();
        return Collections.emptyList();
    }
}
