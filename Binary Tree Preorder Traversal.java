class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root, output);
        return output;
    }
    
    public void helper(TreeNode root, List<Integer> output){
        if(root==null)
            return;
        output.add(root.val);
        helper(root.left, output);
        helper(root.right, output);
    }
}
