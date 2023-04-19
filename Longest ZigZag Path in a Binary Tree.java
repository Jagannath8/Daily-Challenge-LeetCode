class Solution {
    public int ans=0;
    public int longestZigZag(TreeNode root) {
        solve(root,0,0);
        solve(root,1,0);
        return ans;
    }

    public void solve(TreeNode root, int dir, int curr){
        if(root==null)
            return;
        
        ans=Math.max(ans,curr);
        if(dir==1){
            solve(root.left,0,curr+1);
            solve(root.right,1,1);
        }

        else{
            solve(root.right,1,curr+1);
            solve(root.left,0,1);
        }
    }
}
