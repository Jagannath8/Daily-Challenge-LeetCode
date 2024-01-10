class Solution {
    int ans;
    public int amountOfTime(TreeNode root, int start) {
        dfs(root,start);
        return ans;
    }

    public int dfs(TreeNode node, int start){
        if(node==null)
            return 0;
        int left=dfs(node.left, start);
        int right=dfs(node.right, start);
        if(node.val==start){
            ans=Math.max(left,right);
            return -1;
        }
        else if(left>=0 && right>=0)
            return Math.max(left,right)+1;
        
        ans=Math.max(ans, Math.abs(left-right));
        return Math.min(left,right)-1;
    }
}
