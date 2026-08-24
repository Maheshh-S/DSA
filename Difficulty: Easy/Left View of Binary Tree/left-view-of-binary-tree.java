/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        // code here
        Queue<Node> q = new LinkedList<>();
        
        ArrayList<Integer> res = new ArrayList<>();
        
        if(root == null) return res;
        
        q.offer(root);
        
        while(!q.isEmpty()){
            
            int size = q.size();
            
            for(int i = 0 ; i < size; i++){
                Node curr = q.poll();
                
                if(i == 0){
                    res.add(curr.data);
                }
                
                if(curr.left != null) q.offer(curr.left);
                if(curr.right != null) q.offer(curr.right);

            }
            
        }
        return res;
    }
}