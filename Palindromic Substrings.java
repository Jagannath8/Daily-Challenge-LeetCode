class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        boolean palindrome[][]=new boolean[n][n];
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i+1;j++){
                if(s.charAt(j)==s.charAt(j+i-1) && (i<=2 || palindrome[j+1][j+i-2])){
                    palindrome[j][j+i-1]=true;
                    ans++;
                }
            }
        }
        return ans;
    }
}
