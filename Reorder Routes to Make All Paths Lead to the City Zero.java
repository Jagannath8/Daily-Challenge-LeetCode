class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<connections.length;i++){
            adj.get(connections[i][0]).add(connections[i][1]);
            adj.get(connections[i][1]).add(-connections[i][0]);
        }

        boolean vis[]=new boolean[n];
        int ans=0;
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int curr=q.poll();
            for(int x: adj.get(Math.abs(curr))){
                if(!vis[Math.abs(x)]){
                    q.add(x);
                    vis[Math.abs(x)]=true;
                    if(x>0)
                        ans++;
                }
            }
        }
        return ans;
    }
}
