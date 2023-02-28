class Solution {
    Map<String, Integer> map=new HashMap<>();
    List<TreeNode> ans=new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        helper(root);
        return ans;
    }

    public String helper(TreeNode root){
        if(root==null)
            return "";
        String left=helper(root.left);
        String right=helper(root.right);
        String curr=root.val + " " + left + " " + right;
        map.put(curr, map.getOrDefault(curr,0)+1);
        if(map.get(curr)==2)
            ans.add(root);
        
        return curr;
    }
}
