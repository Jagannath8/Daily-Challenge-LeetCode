class Solution {
    public int getLengthOfOptimalCompression(String s, int k) {
        int n=s.length();
        int dp[][]=new int[101][101];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                dp[i][j]=999;
            }
        }

        dp[0][0]=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<=k;j++){
                int cnt=0, del=0;
                for(int t=i;t>=1;t--){
                    if(s.charAt(t-1)==s.charAt(i-1))
                        cnt++;
                    else
                        del++;
                    if(j-del>=0){
                        int temp=0;
                        if(cnt>=100)
                            temp=3;
                        else if(cnt>=10)
                            temp=2;
                        else if(cnt>=2)
                            temp=1;
                        dp[i][j]=Math.min(dp[i][j], dp[t-1][j-del]+1+temp);
                    }
                }

                if(j>0)
                    dp[i][j]=Math.min(dp[i][j], dp[i-1][j-1]);
            }
        }
        return dp[n][k];
    }
}
