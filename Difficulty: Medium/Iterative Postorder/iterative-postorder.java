// User function Template for Java

/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Tree {
    ArrayList<Integer> postOrder(Node node) {
       ArrayList<Integer> postOr = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node lastVisited = null;

        while (!st.isEmpty() || node != null) {
            if (node != null) {
                st.push(node);
                node = node.left;
            } else {
                Node peekNode = st.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    node = peekNode.right;
                } else {
                    postOr.add(peekNode.data);
                    lastVisited = st.pop();
                }
            }
        }

        return postOr;
    }
}