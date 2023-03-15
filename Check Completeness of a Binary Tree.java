class Solution {
    public boolean isCompleteTree(TreeNode root) {
        boolean end=false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.poll();
            if(curr==null)
                end=true;
            else{
                if(end)
                    return false;
                
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}
