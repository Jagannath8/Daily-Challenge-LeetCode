class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n=jobDifficulty.length;
        if(n<d)
            return -1;
        int dp[][]=new int[d][n];
        dp[0][0]=jobDifficulty[0];
        for(int i=1;i<n;i++){
            dp[0][i]=Math.max(dp[0][i-1], jobDifficulty[i]);
        }
        for(int days=1;days<d;days++){
            for(int i=days;i<n;i++){
                int maxi=jobDifficulty[i];
                dp[days][i]=Integer.MAX_VALUE;
                for(int j=i;j>=days;j--){
                    maxi=Math.max(maxi, jobDifficulty[j]);
                    dp[days][i]=Math.min(dp[days][i], dp[days-1][j-1]+maxi);
                }
            }
        }
        return dp[d-1][n-1];
    }
}
