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

    long total=0;
    long prod=0;

    public int maxProduct(TreeNode root) {
        dfs(root);
        calculateSubTreeSum(root);
        return (int)(prod % 1000000007);
    }

    public void dfs(TreeNode root){
        if(root==null)
            return;
        dfs(root.left);
        dfs(root.right);
        total+=(long)root.val;
    }

    public long calculateSubTreeSum(TreeNode root){
        if(root==null)
            return 0;
        long l=calculateSubTreeSum(root.left);
        long r=calculateSubTreeSum(root.right);
        long subTreeSum=l+r+root.val;
        prod=Math.max(prod, subTreeSum*(total-subTreeSum));
        return subTreeSum;
    }
}
