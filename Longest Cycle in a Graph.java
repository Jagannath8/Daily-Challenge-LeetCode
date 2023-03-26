class Solution {
    public int longestCycle(int[] edges) {
        int ans=-1;
        int time=1;
        int vis[]=new int[edges.length];
        for(int curr=0;curr<edges.length;curr++){
            if(vis[curr]>0)
                continue;
            final int start=time;
            int u=curr;
            while(u!=-1 && vis[u]==0){
                vis[u]=time++;
                u=edges[u];
            }

            if(u!=-1 && vis[u]>=start)
                ans=Math.max(ans, time-vis[u]);
        }

        return ans;
    }
}
