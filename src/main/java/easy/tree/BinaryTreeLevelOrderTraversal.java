package easy.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    private List<List<TreeNode>> nodeContainer = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        nodeContainer.add(Collections.singletonList(root));
        for (int i = 0; i < nodeContainer.size(); i++) {
            List<TreeNode> treeNodes = nodeContainer.get(i);
            List<TreeNode> temp = new ArrayList<>();
            for (TreeNode treeNode : treeNodes) {
                List<TreeNode> children = getChildren(treeNode);
                if (children != null) {
                    temp.addAll(children);
                }
            }
            if (temp.size() != 0) {
                nodeContainer.add(temp);
            }
        }
        return getValues(nodeContainer);
    }

    private List<TreeNode> getChildren(TreeNode treeNode) {
        List<TreeNode> treeNodes = new ArrayList<>();
        if (treeNode.left != null) {
            treeNodes.add(treeNode.left);
        }
        if (treeNode.right != null) {
            treeNodes.add(treeNode.right);
        }
        return treeNodes.size() > 0 ? treeNodes : null;
    }

    private List<List<Integer>> getValues(List<List<TreeNode>> lists){
        List<List<Integer>> result = new ArrayList<>();
        for (List<TreeNode> treeNodes : lists) {
            result.add(getValue(treeNodes));
        }
        return result;
    }

    private List<Integer> getValue(List<TreeNode> lists) {
        List<Integer> temp = new ArrayList<>();
        for (TreeNode treeNode : lists) {
            if (treeNode != null) {
                temp.add(treeNode.val);
            }
        }
        return temp;
    }
}
