/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        


        if(headA == headB) return headA;


        int len1 =0, len2=0;

        ListNode curr1 = headA;
        while(curr1 != null){
            len1++;
            curr1 = curr1.next;
        }

            ListNode curr2 = headB;
        while(curr2 != null){
            len2++;
            curr2 = curr2.next;
        }


        int diff = Math.abs(len1-len2);

        if(diff > 0){
            if(len1 > len2){
                for(int i =1;i<=diff;i++){
                    headA = headA.next;
                }
                }else{
                    for(int i = 1; i<=diff;i++){
                        headB = headB.next;
                    }
                }
            }
        

        while(headA != null && headB != null && headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}