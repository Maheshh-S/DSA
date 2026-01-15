/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode curr = head;
        ListNode slow = head;

        if(head == null){
            return false; 
        }
        while(curr.next != null && curr.next.next != null){
            slow = slow.next;
            curr = curr.next.next;

            if(curr == slow){
                return true;
            }
        }
        return false;
    }
}