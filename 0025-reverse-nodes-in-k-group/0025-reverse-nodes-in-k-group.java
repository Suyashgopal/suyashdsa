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
      if(head== null|| head.next== null){
        return head;

      }

        //reverse the list with a counter c
        int c= k;
        ListNode curr= head;
        ListNode after= null;
        ListNode prev= null;
        while(curr!= null && c>0){
            after= curr.next;
            curr.next= prev;
            prev= curr;
            curr= after;
            c--;  }


        if(curr==null && c>0){
            curr= prev ;
            prev= null;
            after= null;
               
                while(curr!= null){
            after= curr.next;
            curr.next= prev;
            prev= curr;
            curr= after;
            }



        }
        if(c>0){
            return head;

        }
        else{
       head.next=   reverseKGroup(curr,k);

        }
        return prev;






        
    }
}