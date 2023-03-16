class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return build(inorder, postorder, 0, inorder.length-1, postorder.length-1);
    }

    public TreeNode build(int inorder[], int postorder[], int inStart, int inEnd, int postEnd){
        if(inStart>inEnd || postEnd<0)
            return null;

        TreeNode root=new TreeNode(postorder[postEnd]);
        int inIndex=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==root.val){
                inIndex=i;
                break;
            }
        }

        root.right=build(inorder, postorder, inIndex+1, inEnd, postEnd-1);
        root.left=build(inorder, postorder, inStart, inIndex-1, postEnd-(inEnd-inIndex)-1);
        return root;
    }
}
