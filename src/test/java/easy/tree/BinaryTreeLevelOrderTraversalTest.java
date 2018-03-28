package easy.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTraversalTest {

    @Test
    public void levelOrder() {
        TreeNode tree3 = TreeNode.instance();
        tree3.left = TreeNode.instance();
        tree3.right = TreeNode.instance();
        tree3.right.left = TreeNode.instance();
        tree3.right.left.right = TreeNode.instance();
        List<List<Integer>> result = new BinaryTreeLevelOrderTraversal().levelOrder(tree3);
        List<List<Integer>> result1 = new BinaryTreeLevelOrderTraversal().levelOrder(null);
    }
}