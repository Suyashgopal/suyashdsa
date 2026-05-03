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
    public ListNode sortList(ListNode head) {


        // base case 
        if(head== null || head.next== null){
            return head;
        }

        //reccursively get left sorted
        ListNode secondhalf= split(head);
        ListNode left= sortList(head);
        ListNode right= sortList(secondhalf);
           return merge(left,right);


    
    }
    ListNode merge(ListNode left,ListNode right){
        ListNode dummy= new ListNode(-1);
        ListNode temp= dummy;

          ListNode lp= left;
            ListNode rp= right;
        while(lp!= null && rp!=null){
            if(lp.val<=rp.val){
                temp.next= lp;
                lp= lp.next;
                temp=temp.next;}
            else{
                 temp.next= rp;
                rp= rp.next;
                temp=temp.next;
            }
        }

        if(lp!= null){
            temp.next= lp;

        }
        if(rp!=null){
            temp.next=rp;
        }
        return dummy.next;

    }




    ListNode split(ListNode head){
        ListNode slow= head;
        ListNode fast= head;

        while(fast!= null && fast.next!= null){
            //we follow a different travesal than the nomal fast and slow here cause we want diffn result draw the result and then see 

            fast= fast.next.next;
            if(fast!= null){
                slow= slow.next;
            }
  }
  ListNode temp= slow.next;
  slow.next= null;
  return temp;
    }
}