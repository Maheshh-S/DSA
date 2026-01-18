/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = head;

       if (head == null || head.next == null) return null;

        while (fast.next != null && fast.next.next != null) {
            // System.out.println("this is prev now befor   " + prev.val);
           
            prev = slow;
            slow = slow.next;
            // System.out.println("this is slow now  " + slow.val);

            fast = fast.next.next;
            // System.out.println("this is fast now  " + fast.val);

        }
            // System.out.println("this is prev now    " + prev.val);

        if (fast != null && fast.next == null) {
            // System.out.println("this is prev now    " + prev.val);
            //odd len so remove slow remove
            prev.next = slow.next;


        } else {
             
            //evern len so remove slow.next
            prev = prev.next;
            prev.next = slow.next.next;
        }
        
         if(slow == fast){
            slow.next = null;
        }
        
        return head;
    }
}