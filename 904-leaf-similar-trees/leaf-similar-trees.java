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
    
 private void dfs(TreeNode node, ArrayList<Integer> list) {
    if (node == null) return;

    if (node.left == null && node.right == null)
      list.add(node.val);

    dfs(node.left, list);
    dfs(node.right, list);
  }

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    var list1 = new ArrayList<Integer>();
    var list2 = new ArrayList<Integer>();

    dfs(root1, list1);
    dfs(root2, list2);
    
    return list1.equals(list2);
  }
}