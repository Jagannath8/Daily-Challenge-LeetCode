class Solution {
    int dirc[][]=new int[][]{{-1,0}, {1,0}, {0,-1}, {0,1}};
    public int maxDistance(int[][] grid) {
        int vis[][]=new int[grid.length][grid[0].length];
        Queue<Pair<Integer, Integer>> q=new LinkedList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                vis[i][j]=grid[i][j];
                if(grid[i][j]==1)
                    q.add(new Pair(i,j));
            }
        }

        int dist=-1;
        while(!q.isEmpty()){
            int size=q.size();
            while(size-- > 0){
                Pair<Integer, Integer> land=q.poll();
                for(int []dir: dirc){
                    int x=land.getKey()+dir[0];
                    int y=land.getValue()+dir[1];
                    if(x>=0 && y>=0 && x<grid.length && y<grid[0].length && vis[x][y]==0){
                        vis[x][y]=1;
                        q.add(new Pair(x,y));
                    }
                }
            }
            dist++;
        }
        return dist==0 ? -1 :dist;
    }
}
