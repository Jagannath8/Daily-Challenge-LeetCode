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
    int digits[];
    public int pseudoPalindromicPaths (TreeNode root) {
        digits=new int[10];
        dfs(root);return ans;
    }

    public void dfs(TreeNode root){
        if(root==null)
            return;

        digits[root.val]++;
        if(root.left==null && root.right==null){
            if(isPalindrome())
                ans++;
        }
        else{
            dfs(root.left);
            dfs(root.right);
        }
        digits[root.val]--;
    }

    boolean isPalindrome(){
        int odd=0;
        for(int i=1;i<=9;i++){
            if(digits[i]%2!=0)
                odd++;
        }

        if(odd>1){
            return false;
        }        
        return true;
    }
}
