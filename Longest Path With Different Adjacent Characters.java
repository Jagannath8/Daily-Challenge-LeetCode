class Solution {
    int ans=1;
    public int longestPath(int[] parent, String s) {
        Map<Integer, List<Integer>> adjList=new HashMap<>();
        for(int i=1;i<parent.length;i++)
            adjList.computeIfAbsent(parent[i], value -> new ArrayList<Integer>()).add(i);
        
        dfs(0,adjList,s);
        return ans;
    }

    public int dfs(int node, Map<Integer, List<Integer>> adjList, String s){
        if(!adjList.containsKey(node))
            return 1;

        int longestPath=0;
        int secondLongestPath=0;

        for(int child: adjList.get(node)){
            int LongestPathfromChild=dfs(child, adjList, s);
            if(s.charAt(node)==s.charAt(child))
                continue;
            if(LongestPathfromChild > longestPath){
                secondLongestPath = longestPath;
                longestPath = LongestPathfromChild;
            }
            else if(LongestPathfromChild > secondLongestPath)
                secondLongestPath = LongestPathfromChild;
        }
        ans = Math.max(ans, longestPath + secondLongestPath + 1);
        return longestPath+1;
    }
}
