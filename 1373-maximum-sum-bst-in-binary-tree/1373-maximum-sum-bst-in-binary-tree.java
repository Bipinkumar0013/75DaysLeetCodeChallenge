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
        int max;
        int min;
        int size;
        int sum;
        boolean isBst;


        Pent(int max, int min,int size,int sum , boolean isBst) {
            this.max = max;
            this.min = min;
            this.size = size;
            this.sum = sum;
            this.isBst = isBst;

        }
    }
    static int maxSum;
    public int maxSumBST(TreeNode root) {
        maxSum = 0;
        helper(root);
        return maxSum;

        
    }
     Pent helper(TreeNode root) {
        if (root == null) return new Pent(Integer.MIN_VALUE, Integer.MAX_VALUE,0,0, true);
        Pent lst = helper(root.left);
        Pent rst = helper(root.right);
        int max = Math.max(root.val, Math.max(lst.max, rst.max));
        int min = Math.min(root.val, Math.min(lst.min, rst.min));
        int size = 1+ rst.size +lst.size;
        boolean isBst;
        int sum =0;
        if (lst.max < root.val && rst.min > root.val && lst.isBst && rst.isBst) {
            isBst = true;
        } else {
            isBst = false;
      }
      if(isBst){
         sum = root.val +lst.sum + rst.sum;
         maxSum = Math.max(maxSum,sum);

      }
        return new Pent(max, min,size,sum, isBst);
    }
}