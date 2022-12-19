class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean seen[]=new boolean[n];

        for(int [] edge: edges){
            int a=edge[0];
            int b=edge[1];
            graph.computeIfAbsent(a, val->new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val->new ArrayList<Integer>()).add(a);
        }

        return dfs(graph,seen,source,destination);
    }

    public boolean dfs(Map<Integer, List<Integer>> graph, boolean seen[], int currNode, int dest){
        if(currNode==dest)
            return true;
        if(!seen[currNode]){
            seen[currNode]=true;
            for(int x:graph.get(currNode)){
                if(dfs(graph, seen, x, dest))
                    return true;
            }
        }
        return false;
    }
}
