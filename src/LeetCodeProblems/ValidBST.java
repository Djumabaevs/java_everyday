package LeetCodeProblems;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ValidBST {
    public boolean isValidBST (TreeNode root) {

        return validate(root,null,null);

    }
    public boolean validate(TreeNode root, Integer low, Integer high) {
        //empty BST are valid
        if(root == null) {
            return true;
        }
        //The current's node's value must be between low and high
        if((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        //left and right subtrees must also be valid
        return validate(root.right, root.val, high) && validate(root.left, low, root.val);
    }

    //2nd approach
}
class Solution2 {
    private final Deque<TreeNode> stack = new LinkedList<>();
    private final Deque<Integer> upperLimits = new LinkedList<>();
    private final Deque<Integer> lowerLimits = new LinkedList<>();

    public void update(TreeNode root, Integer low, Integer high) {
        stack.add(root);
        lowerLimits.add(low);
        upperLimits.add(high);
    }
    public boolean isValidBST2(TreeNode root) {
        Integer low = null, high = null, val;
        update(root, low, high);

        while(!stack.isEmpty()) {
            root = stack.poll();
            low = lowerLimits.poll();
            high = upperLimits.poll();

            if (root == null) continue;
            val = root.val;
            if(low != null && val <= low) {
                return false;
            }
            if(high != null && val >= high) {
                return false;
            }
            update(root, val, high);
            update(root, low, val);
        }
        return true;
    }
}
//3rd approach




