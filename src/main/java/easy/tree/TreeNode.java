package easy.tree;

import com.github.javafaker.Faker;

/**
 * 二叉树节点
 * created by eric on 18-2-27
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }

    public static TreeNode instance(){
        return new TreeNode(Faker.instance().number().numberBetween(1, 10000));
    }
}
