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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode curr = head;

        ArrayList<Integer> list = new ArrayList<>();

        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        int i = left-1 ; 
        int j = right-1;

        while( i < j){
            int tempi = list.get(i);
            int tempj = list.get(j);

            
            list.set(i,tempj);
            list.set(j,tempi);

            i++;
            j--;
            
        }
        curr = head;
        int idx = 0;
        while(curr != null){
            curr.val = list.get(idx++);
            curr = curr.next;
        }

return head;

    }
}