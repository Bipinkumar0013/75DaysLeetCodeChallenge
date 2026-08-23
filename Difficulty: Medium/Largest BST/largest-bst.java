/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    public Node(int d) {
     data = d;
     left = right = null;
   }
} */

class Solution {
        class Quad {
            int max;
            int min;
            int size;
            boolean isBst;

            Quad(int max, int min,int size , boolean isBst) {
                this.max = max;
                this.min = min;
                this.size = size;
                this.isBst = isBst;

            }
        }
         public int maxSize =0;
    public int largestBst(Node root) {
        // code here
        maxSize =0;
        helper(root);
        return maxSize;

        
    }
     Quad helper(Node root) {
            if (root == null) return new Quad(Integer.MIN_VALUE, Integer.MAX_VALUE,0, true);
            Quad lst = helper(root.left);
            Quad rst = helper(root.right);
            int max = Math.max(root.data, Math.max(lst.max, rst.max));
            int min = Math.min(root.data, Math.min(lst.min, rst.min));
            int size = 1 + lst.size + rst.size;
            boolean isBst;
            if (lst.max < root.data && rst.min > root.data && lst.isBst && rst.isBst) {
                isBst = true;
            } else {
                isBst = false;
          }
           if(isBst)maxSize = Math.max(size,maxSize);
            return  new Quad(max, min, size ,isBst);
        }
    }


