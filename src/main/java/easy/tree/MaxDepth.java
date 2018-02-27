package easy.tree;

/**
 * 查找二叉树的最大深度
 * created by eric on 18-2-27
 */
public class MaxDepth {

    public int maxDepth(TreeNode root) {
        return childDepth(root);
    }

    private int childDepth(TreeNode parent) {
        if (parent == null) {
            return 0;
        }
        int leftDepth = childDepth(parent.left) + 1;
        int rightDepth = childDepth(parent.right) + 1;
        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}
