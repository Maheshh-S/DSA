/* Structure of Linked List Node
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        this.data = d;
        this.next = null;
    }
}
*/
class Solution {
    Node deleteNode(Node head, int x) {
        // code here
        Node curr = head;
        Node prev = null;
        if(head == null){
            return null;
        }
        
        if (x == 1) {
            head = head.next;
            return head;
        }
        
        int cnt = 1;
        
        while(curr != null && cnt <x){
            prev = curr;
            curr = curr.next;
            cnt++;
        }
        if (curr != null && prev != null) {
            prev.next = curr.next;
        }
        // prev.next = curr.next;
        return head;
    }
}