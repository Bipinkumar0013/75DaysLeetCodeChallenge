/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
       class Triplet {
           int max;
           int min;
           boolean isBst;

           Triplet(int max, int min, boolean isBst) {
               this.max = max;
               this.min = min;
               this.isBst = isBst;

           }
       }
       public boolean isBST(Node root) {
           return helper(root).isBst;
       }


       Triplet helper(Node root) {
           if (root == null) return new Triplet(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
           Triplet lst = helper(root.left);
           Triplet rst = helper(root.right);
           int max = Math.max(root.data, Math.max(lst.max, rst.max));
           int min = Math.min(root.data, Math.min(lst.min, rst.min));
           boolean isBst;
           if (lst.max < root.data && rst.min > root.data && lst.isBst && rst.isBst) {
               isBst = true;
           } else {
               isBst = false;
         }
           return  new Triplet(max, min, isBst);
       }
   }

