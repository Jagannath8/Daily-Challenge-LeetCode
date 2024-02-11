class Solution {
    public int cherryPickup(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int dp[][][]=new int [m][n][n];
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                Arrays.fill(dp[i][j],-1);
            }
        }

        dp[0][0][n-1]=grid[0][0]+grid[0][n-1];  
        
        for(int i=1;i<m;i++) {
            for(int j=0;j<n;j++) { 
                for(int k=j+1;k<n;k++) { 
                    int maxi=-1;
                    for(int x=-1;x<=1;x++) { 
                        for(int y=-1;y<=1;y++) {
                            if(j+x >= 0 && j+x < n && k+y >= 0 && k+y < n)
                                maxi=Math.max(maxi,dp[i-1][j+x][k+y]);
                        }
                    }
                    if(maxi != -1)
                        dp[i][j][k] = maxi + grid[i][j] + grid[i][k];
                    if(ans < dp[i][j][k]) 
                        ans = dp[i][j][k];
                }
            }
        }
        return ans;
    }
}
