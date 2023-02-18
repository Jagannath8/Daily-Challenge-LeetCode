class Solution {
    int ans=Integer.MAX_VALUE;
    TreeNode prev=null;

    public int minDiffInBST(TreeNode root) {
        inOrder(root);
        return ans;
    }

    private void inOrder(TreeNode root){
        if(root==null)
            return;

        inOrder(root.left);
        if(prev!=null){
            ans=Math.min(ans, root.val-prev.val);
        }
        prev=root;
        inOrder(root.right);
    }
}
