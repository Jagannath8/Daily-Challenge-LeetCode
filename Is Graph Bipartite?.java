class Solution {
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        int color[]=new int[n];
        for(int i=0;i<n;i++){
            if(color[i]!=0)
                continue;
            
            Queue<Integer> q=new ArrayDeque<>();
            q.add(i);
            color[i]=1;
            while(!q.isEmpty()){
                int curr=q.poll();
                for(int g: graph[curr]){
                    if(color[g]==0){
                        color[g]=-color[curr];
                        q.add(g);
                    }
                    else if(color[g]!=-color[curr]){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
