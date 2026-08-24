/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans = 0;
    public int maxDepth(TreeNode root) {
        
        return height(root);
    }

    private int height(TreeNode root){
        
        if(root == null) return 0;

        int left = height(root.left);
        int right = height(root.right);

        ans = Math.max(left , right);
        return Math.max(left , right)+1;
    }
}