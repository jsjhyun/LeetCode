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
    public int solve(TreeNode node, int depth) {
       if(node == null)
            return depth;
        return Math.max(solve(node.left, depth+1), solve(node.right, depth+1));   
    }
     public int maxDepth(TreeNode root) {
        int res = solve(root, 0);
        return res;
    }
}