class Solution {
    int count = 0;
    public int pseudoPalindromicPaths(TreeNode root) {
        return pseudoPalindromicPathsHelper(root, 0);
    }

     private int pseudoPalindromicPathsHelper(TreeNode root, int pathCount) {
        if (root == null) {
            return 0;
        }

        // Update the pathCount using the current node value
        pathCount ^= (1 << root.val);

        // If it is a leaf node, check if the path is pseudo-palindromic
        if (root.left == null && root.right == null) {
            if ((pathCount & (pathCount - 1)) == 0) {
                count++;
            }
        }

        // Recursively traverse left and right subtrees
        pseudoPalindromicPathsHelper(root.left, pathCount);
        pseudoPalindromicPathsHelper(root.right, pathCount);

        return count;
    }

   
}
