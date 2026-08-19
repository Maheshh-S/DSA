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
    public void reorderList(ListNode head) {


        if(head.next == null || head.next.next == null) return;

        ListNode slow = head;
        ListNode fast = head;


        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode sec = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = sec;


        while(curr != null){

            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode first = head;
        sec = prev;

        while(sec != null){

            ListNode next1 = first.next;
            ListNode next2 = sec.next;

            first.next = sec;
            sec.next = next1;

            first = next1;
            sec = next2;
        }

        
    }
}