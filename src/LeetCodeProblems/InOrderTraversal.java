package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }
    private void helper(TreeNode root, List<Integer> res) {
        if(root != null) {
            if(root.left != null) {
                helper(root.left, res);
            }
            res.add(root.val);
            if(root.right != null) {
                helper(root.right, res);
            }
        }
    }
    //2n approach
    public List<Integer> inOrderTraversalStack(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }
        return result;
    }
}
