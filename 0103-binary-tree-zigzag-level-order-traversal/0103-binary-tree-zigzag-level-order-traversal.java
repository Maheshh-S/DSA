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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {


        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        boolean l2r = true;


        while(!q.isEmpty()){
            int lvlsize = q.size();

            List<Integer> lvl = new ArrayList<>();

            for(int i = 0 ; i < lvlsize ; i++){
                TreeNode node = q.poll();

                if(l2r){
                    lvl.add(node.val);
                }else{
                    lvl.add(0,node.val);
                }

                if(node.left != null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }

            res.add(lvl);

            l2r = !l2r;
        }
        return res;
    }
}