class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int dest[]=new int[n];
        for(List<Integer> e: edges){
            dest[e.get(1)]++;
        }

        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(dest[i]==0)
                ans.add(i);
        }
        return ans;
    }
}
