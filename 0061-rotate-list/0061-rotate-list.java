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
    public static int length(ListNode head){
        int len =0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
         int len = length(head);
        if(head == null || head.next == null ) return head;
        ListNode fast = head;
        ListNode slow = head;
        k = k%len;
        if(k==0) return head;
        for(int i =1 ; i<k+1;i++){
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next ;
            slow = slow.next;
        }
        ListNode a = slow.next;
        fast.next = head;
        slow.next = null;
        return a;
    }
}