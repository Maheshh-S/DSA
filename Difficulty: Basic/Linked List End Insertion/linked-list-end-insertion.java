/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    public Node insertAtEnd(Node head, int x) {
        // code here
        Node curr = head;
        Node newNode = new Node(x);
        if(head == null){
             head = newNode;
             return head;
        }
        while(curr.next != null){
            curr = curr.next;
        }
        
        curr.next = newNode;
        return head;
    }
}