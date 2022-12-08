class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();

        createLeaf(root1,list1);
        createLeaf(root2,list2);

        if(list1.size()!=list2.size())
            return false;

        for(int i=0;i<list1.size();i++){
            if(list1.get(i)!=list2.get(i))
                return false;
        }
        return true;
    }

    public static void createLeaf(TreeNode root, List<Integer> list){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            list.add(root.val);
            return;
        }

        createLeaf(root.left,list);
        createLeaf(root.right,list);
    }
}
