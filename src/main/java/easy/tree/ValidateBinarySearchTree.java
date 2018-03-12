package easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 验证是否是二叉搜索树
 */
public class ValidateBinarySearchTree {

    // 使用中序遍历节点，使用集合保存节。最后遍历保存的节点，验证结果
    private List<TreeNode> container = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        loop(root);
        return valid();
    }
    private void loop(TreeNode node) {
        if (node == null) {
            return;
        }
        loop(node.left);
        container.add(node);
        loop(node.right);
    }
    private boolean valid() {
        for (int i = 1; i < container.size(); i++) {
            if (container.get(i - 1).val >= container.get(i).val) {
                return false;
            }
        }
        return true;
    }

    // 使用中序遍历节点，使用上一个节点与当前节点比较
    private TreeNode temp;
    private boolean result = true;
    public boolean isValidBST1(TreeNode root) {
        loop1(root);
        return result;
    }
    private void loop1(TreeNode node) {
        if (node == null) {
            return;
        }
        loop1(node.left);
        if (temp != null && temp.val >= node.val) {
            result = false;
        }
        temp = node;
        loop1(node.right);
    }
}
