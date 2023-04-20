class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)
            return 0;
        
        Queue<Pair<TreeNode, Integer>> q=new LinkedList<>();
        q.add(new Pair<>(root,0));
        int ans=0;
        while(!q.isEmpty()){
            int sz=q.size();
            int start=q.peek().getValue();
            int idx=0;
            for(int i=0;i<sz;i++){
                Pair<TreeNode, Integer> pair=q.poll();
                TreeNode node=pair.getKey();
                idx=pair.getValue();
                if(node.left!=null)
                    q.add(new Pair<>(node.left, 2*idx));
                
                if(node.right!=null)
                    q.add(new Pair<>(node.right, 2*idx+1));
            }

            ans=Math.max(ans, idx-start+1);
        }

        return ans;
    }
}
