class Solution {
    int ans=Integer.MAX_VALUE;
    public int minScore(int n, int[][] roads) {
        List<List<int[]>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }

        for(int k[]: roads){
            adj.get(k[0]).add(new int[]{k[1], k[2]});
            adj.get(k[1]).add(new int[]{k[0], k[2]});
        }

        boolean vis[]=new boolean[n+1];
        dfs(adj, 1, vis);
        return ans;
    }

    void dfs(List<List<int[]>>li, int node, boolean vis[]){
        vis[node]=true;
        for(int k[]: li.get(node)){
            ans=Math.min(ans, k[1]);
            if(!vis[k[0]])
                dfs(li, k[0], vis);
        }
    }
}
