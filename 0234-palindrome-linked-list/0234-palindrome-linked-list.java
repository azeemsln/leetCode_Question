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
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> arr= new ArrayList<Integer>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n=arr.size();
        int flag=0;
        if(n==1){
            return true;
        }
        for(int i=0;i<(n-1);i++){
            if(arr.get(i)==arr.get(n-i-1)){
                flag=1;
                continue;
            }
            else{
                flag=0;
                break;
            }
        }
        if(flag==0){
            return false;
        }
        return true;
    }
}