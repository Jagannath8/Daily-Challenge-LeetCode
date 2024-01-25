class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()][text2.length()];
        for(int i=0;i<text1.length();i++){
            for(int j=0;j<text2.length();j++){
                dp[i][j]=-1;
            }
        }
        return solve(text1, text2, 0, 0);
    }

    int solve(String s1, String s2, int index1, int index2){
        if(index1==s1.length() || index2==s2.length())
            return 0;
        
        if(dp[index1][index2]>=0)
            return dp[index1][index2];

        if(s1.charAt(index1)==s2.charAt(index2))
            dp[index1][index2] = 1 + solve(s1,s2,index1+1,index2+1);
        
        else
            dp[index1][index2] = Math.max(solve(s1,s2,index1+1,index2), solve(s1,s2,index1,index2+1));

        return dp[index1][index2];
    }
}
