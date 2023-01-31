class Solution {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n=scores.length;
        int team[][]=new int[n][2];
        for(int i=0;i<n;i++){
            team[i][0]=ages[i];
            team[i][1]=scores[i];
        }

        Arrays.sort(team, (a,b) -> a[0]!=b[0] ? a[0]-b[0] : a[1]-b[1]);
        int dp[]=new int[n];
        dp[0]=team[0][1];

        for(int i=1;i<n;i++){
            int max=team[i][1];
            for(int j=0;j<i;j++){
                if(team[i][1]>=team[j][1])
                    max=Math.max(max, dp[j] + team[i][1]);
            }
            dp[i]=max;
        }

        int ans=0;
        for(int num: dp){
            ans=Math.max(ans, num);
        }

        return ans;
    }
}
