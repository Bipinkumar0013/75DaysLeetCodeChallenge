/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
   if(head == null) return head;
   Node t1 = head;
   while(t1!= null){
    if(t1.child==null){
    t1=t1.next;
    continue;
    }
    Node a = t1.next;
    Node t2 = flatten(t1.child);
    t1.next =t2;
    t2.prev=t1;
    t1.child = null;
    Node temp = t2;
    while(temp.next!=null){
    temp=temp.next;
    }
   temp.next=a;
   if(a!=null) a.prev=temp;
    t1 = a;
   }
   
    return head;
    }
}