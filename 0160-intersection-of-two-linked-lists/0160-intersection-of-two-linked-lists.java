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
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            while(tempB!=null){
                if(tempA==tempB){
                    return tempA;
                }
                if(tempA.next==tempB.next){
                    if(tempA.next==null && tempB.next==null && tempA!=tempB)
                        return null;
                   else if(tempA.next==null)
                        return tempA;
                    else
                        return tempA.next;
                }
                tempB=tempB.next;
            }
            tempB=headB;
            tempA=tempA.next;
        }
        return null;
    }
}