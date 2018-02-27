package easy.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * created by eric on 18-2-27
 */
public class MaxDepthTest {

    @Test
    public void maxDepth() {
        TreeNode tree1 = TreeNode.instance();
        TreeNode tree2 = TreeNode.instance();
        tree2.left = TreeNode.instance();
        TreeNode tree3 = TreeNode.instance();
        tree3.left = TreeNode.instance();
        tree3.right = TreeNode.instance();
        tree3.right.left = TreeNode.instance();
        tree3.right.left.right = TreeNode.instance();
        MaxDepth instance = new MaxDepth();
        assertThat(instance.maxDepth(tree1), CoreMatchers.is(1));
        assertThat(instance.maxDepth(tree2), CoreMatchers.is(2));
        assertThat(instance.maxDepth(tree3), CoreMatchers.is(4));
    }
}