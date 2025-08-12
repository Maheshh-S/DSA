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
      int maxs = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {

      
        maxGain(root);
        return maxs;        
    }

    private int maxGain ( TreeNode node){
        if(node == null){
            return 0;
        }

        int lsum = Math.max(maxGain(node.left), 0);
        int rsum = Math.max(maxGain(node.right), 0);

        int newPathPrice = node.val + lsum + rsum;

        maxs = Math.max(maxs, newPathPrice);

        return node.val + Math.max(lsum , rsum);
    }
}