class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length, ans=0;
        for(int i=0;i<n;i++)
            ans+=mat[i][i]+mat[i][n-i-1];

        if(n%2==1)
            ans-=mat[n/2][n/2];
        
        return ans;
    }
}
