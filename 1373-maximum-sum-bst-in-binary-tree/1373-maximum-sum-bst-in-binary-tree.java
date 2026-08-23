/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     class Pent {
        long max;
        long min;
        long size;
        long sum;
        boolean isBst;


        Pent(long max, long min,long size,long sum , boolean isBst) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.sum = sum;
            this.isBst = isBst;

        }
    }
    static long max1;
    public int maxSumBST(TreeNode root) {
        max1 = 0;
        helper(root);
        return (int)max1;

        
    }
     Pent helper(TreeNode root) {
        if (root == null) return new Pent(Integer.MIN_VALUE, Integer.MAX_VALUE,0,0, true);
        Pent lst = helper(root.left);
        Pent rst = helper(root.right);
        long max = Math.max(root.val, Math.max(lst.max, rst.max));
        long min = Math.min(root.val, Math.min(lst.min, rst.min));
        long size = 1+ rst.size +lst.size;
        boolean isBst;
        long sum =0;
        if (lst.max < root.val && rst.min > root.val && lst.isBst && rst.isBst) {
            isBst = true;
        } else {
            isBst = false;
      }
      if(isBst){
         sum = root.val +lst.sum + rst.sum;
         max1 = Math.max(max1,sum);

      }
        return  new Pent(max, min,size,sum, isBst);
    }
}