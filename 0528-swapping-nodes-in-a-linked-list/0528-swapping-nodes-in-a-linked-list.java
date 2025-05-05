class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode frontNode = head;
        ListNode endNode = head;
        ListNode curr = head;
        
        // Find the k-th node from the start
        for (int i = 1; i < k; i++) {
            frontNode = frontNode.next;
        }
        
        // Find the k-th node from the end
        // First, move a pointer k nodes ahead
        ListNode fast = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        
        // Then move both pointers until fast reaches end
        while (fast != null) {
            endNode = endNode.next;
            fast = fast.next;
        }
        
        // Swap the values
        int temp = frontNode.val;
        frontNode.val = endNode.val;
        endNode.val = temp;
        
        return head;
    }
}