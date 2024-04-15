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
    int sum;
    public int sumNumbers(TreeNode root) {
        sum=0;
        helper(root,0);
        return sum;
    }

    public void helper(TreeNode root, int num){
        if(root.left==null && root.right==null){
            num=num*10 + root.val;
            sum+=num;
            return;
        }

        num=num*10 + root.val;
        if(root.left!=null)
            helper(root.left, num);
        
        if(root.right!=null)
            helper(root.right, num);
    }
}
