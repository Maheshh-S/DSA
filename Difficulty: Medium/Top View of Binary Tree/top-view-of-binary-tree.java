/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    
    static class Pair{
        Node node;
        int hd;
        
        Pair(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root , 0));
        
        while(!q.isEmpty()){
            Pair curr = q.poll();
            
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd , curr.node.data);
            }
            
                if(curr.node.left != null)
                    q.offer(new Pair(curr.node.left , curr.hd -1));
                    
                if(curr.node.right != null)
                    q.offer(new Pair(curr.node.right , curr.hd +1));


            }
            res.addAll(map.values());
        return res;
    }
}