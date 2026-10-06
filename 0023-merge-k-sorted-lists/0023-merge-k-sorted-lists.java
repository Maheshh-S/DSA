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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<>((a , b) -> a.val - b.val);

        for(ListNode node : lists){
            if(node != null) q.add(node);
        }

        ListNode dummy = new ListNode(0);
        ListNode res = dummy;


        while(!q.isEmpty()){
            ListNode curr = q.poll();
            res.next = curr;
            res = res.next;

            if(curr.next != null){
                q.offer(curr.next);
            }
        }
        return dummy.next;
    }
}