class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        helper(root, output);
        return output;
    }
    
    public void helper(TreeNode root, List<Integer> output){
        if(root==null)
            return;
        helper(root.left, output);
        output.add(root.val);
        helper(root.right, output);
    }
}
