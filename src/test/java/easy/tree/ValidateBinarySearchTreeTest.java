package easy.tree;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {

    @Test
    public void isValidBST() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        Assert.assertThat(new ValidateBinarySearchTree().isValidBST(root), CoreMatchers.is(true));
    }
}