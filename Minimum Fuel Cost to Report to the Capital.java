class Solution {

    private long fuel=0;
    private int seats;

    public long minimumFuelCost(int[][] roads, int seats) {
        List<Integer>[] graph=new List[roads.length+1];
        for(int i=0;i<=roads.length;i++){
            graph[i]=new ArrayList<>();
        }

        for(int[] r: roads){
            int end1=r[0];
            int end2=r[1];
            graph[end1].add(end2);
            graph[end2].add(end1);
        }

        this.seats=seats;
        dfs(graph, 0, -1);
        return fuel;
    }

    public int dfs(List<Integer>[] graph, int curr, int prev){
        int ans=1;
        for(int next: graph[curr]){
            if(next==prev)
                continue;
            
            ans += dfs(graph, next, curr);
        }

        if(curr!=0)
            fuel += (long)(Math.ceil((double)ans/this.seats));

        return ans;
    }
}
