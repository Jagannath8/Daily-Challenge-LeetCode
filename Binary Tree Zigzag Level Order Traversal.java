class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList();
        if(root==null)
            return ans;

        Queue <TreeNode> q=new LinkedList();
        q.add(root);
        int level=1;
        while(!q.isEmpty()){
            List<Integer> li=new ArrayList();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode curr=q.poll();
                li.add(curr.val);
                if(curr.left!=null)
                    q.add(curr.left);
                if(curr.right!=null)
                    q.add(curr.right);
            }

            if(level%2==0){
                List<Integer> al=new ArrayList<>();
                for(int i=li.size()-1;i>=0;i--)
                    al.add(li.get(i));
                
                ans.add(al);
            }
            else
                ans.add(li);
            
            level++;
        }
        return ans;
    }
}
