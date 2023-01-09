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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> sol = new ArrayList<Integer>();
        recTraversal(sol, root);
        return sol;
    }

    private void recTraversal(List<Integer> sol, TreeNode node){
        if (node == null) return;
        sol.add(node.val);
        recTraversal(sol, node.left);
        recTraversal(sol, node.right);
    }
}