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
    public void flatten(TreeNode root) {
        // disconnect
        if(root == null) return;
        TreeNode lst = root.left;
        TreeNode rst = root.right;
        root.left = null;
        root.right = null;
        // flatten lst and rsr
        flatten(lst);
        flatten(rst);
        //Travel lst to the last
        TreeNode last = root;
        root.right =lst;
        while(last.right!=null) last=last.right;
        last.right = rst;
    }
}
        // ArrayList<TreeNode> arr = new ArrayList<>();
    //     dfs(root , arr);
    //     for(int i = 0 ; i< arr.size()-1; i++){
    //         TreeNode a = arr.get(i);
    //         TreeNode b = arr.get(i+1);
    //         a.right = b;
    //         a.left = null;

    //     }
    //     if (arr.size() == 0) return;
    //     TreeNode last = arr.get(arr.size()-1);
    //     last.left = null;
    //     last.right = null;

    // }
    // public void dfs(TreeNode root , ArrayList<TreeNode> arr){
    //     if(root == null) return ;
    //     arr.add(root);
    //     dfs(root.left , arr);
    //     dfs(root.right , arr);
    //  }
