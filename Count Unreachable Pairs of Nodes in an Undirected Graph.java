class Solution {
    List<List<Integer>> x=new ArrayList<>();
    public long countPairs(int n, int[][] edges) {
        for(int i=0;i<n;i++){
            x.add(new ArrayList<>());
        }

        for(int []e: edges){
            x.get(e[0]).add(e[1]);
            x.get(e[1]).add(e[0]);
        }

        long sum=(Long.valueOf(n)*(n-1))/2;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                int ans=dfs(i, vis, new int[1]);
                sum-=(Long.valueOf(ans)*(ans-1))/2;
            }
        }
        return sum;
    }

    int dfs(int node, boolean vis[], int ans[]){
        if(vis[node])
            return ans[0];
        
        vis[node]=true;
        ans[0]++;
        for(int curr: x.get(node)){
            dfs(curr, vis, ans);
        }

        return ans[0];
    }
}
