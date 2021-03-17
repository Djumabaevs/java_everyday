package LeetCodeProblems;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(){}
    TreeNode(int val){this.val = val;}
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
      List<Integer> res = new ArrayList<>();
      helper(root,res);
      return res;
    }
    public void helper(TreeNode root, List<Integer> res) {
        if(root != null) {
            if(root.left != null){
                helper(root.left, res);
            }
            res.add(root.val);
            if(root.right != null){
                helper(root.right, res);
            }
        }
    }

    //2nd approach

    public List<Integer> inorderTraversal2(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            list.add(current.val);
            current = current.right;
        }
        return list;
    }
}
