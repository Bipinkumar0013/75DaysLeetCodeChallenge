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
    public ListNode swapPairs(ListNode head) {
        //3pointer approach
        if(head== null || head.next == null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = dummy;
        while(a!=null && b!=null){
            c.next = b ;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next ;
           if(a!=null) b = a.next;
        }
        return dummy.next;
    }
}
        // ListNode d1=new ListNode(-1);
        // ListNode d2=new ListNode(-1);
        // ListNode t1=d1; if(head==null) return null;
      
        // ListNode t2=d2;
        // ListNode t=head;
        // int idx=0;
        // while(t!=null){
        //     if(idx%2==0){
        //         t1.next=t;
        //         t1=t1.next;
        //     }
        //     else{
        //         t2.next=t;
        //         t2=t2.next;
        //     }
        //     idx++;
        //     t=t.next;
        // }
        // t2.next=null;
        // t1.next=null;
        // d1=d1.next;
        // d2=d2.next;
        // ListNode ans=new ListNode(0);
        // ListNode dummy=ans;
        // while(d1!=null&&d2!=null){
        //     dummy.next=d2;
        //     dummy=dummy.next;
        //     d2=d2.next;
        //     dummy.next=d1;
        //     dummy=dummy.next;
        //     d1=d1.next;
        // }
        // if(d1!=null) dummy.next=d1;
        // return ans.next;
       
    
    
