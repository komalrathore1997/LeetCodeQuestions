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
    int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        diameterOfBinaryTreehelper(root);
        return ans;
    }

    public int diameterOfBinaryTreehelper(TreeNode root){
        if(root==null){
            return 0;
        }

        int lh=diameterOfBinaryTreehelper(root.left);
        int rh=diameterOfBinaryTreehelper(root.right);

        ans = Math.max(ans , lh+rh);

        return 1+Math.max(lh,rh);
    }
}