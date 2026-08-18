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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();

        ListNode curr = head;
        while(curr != null){
            list.add(curr.val);
            curr = curr.next;
        }

        for(int i = 0 ; i+k <= list.size(); i+=k){

            int l = i;
            int r = i+k-1;

            while(l < r){
                int temp = list.get(l);
                list.set(l , list.get(r));
                list.set(r , temp);

                l++;
                r--;
            }
        }

        curr = head;
        int idx = 0;
        while(curr != null){
            curr.val = list.get(idx);
            idx++;
            curr = curr.next;
        }
        return head;
    }
}