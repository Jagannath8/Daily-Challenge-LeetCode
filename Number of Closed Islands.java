class Solution {
    public int closedIsland(int[][] grid) {
        int rows=grid.length;
        int cols=grid[0].length;
        int ans=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==0 && dfs(grid,i,j))
                    ans++;
            }
        }
        return ans;
    }

    public boolean dfs(int grid[][], int i, int j){
        int rows=grid.length;
        int cols=grid[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols)
            return false;
        
        if(grid[i][j]==1)
            return true;

        grid[i][j]=1;
        boolean left=dfs(grid, i, j-1);
        boolean right=dfs(grid, i, j+1);
        boolean up=dfs(grid, i-1, j);
        boolean down=dfs(grid, i+1, j);

        return left && right && up && down;
    }
}
