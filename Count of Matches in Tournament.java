class Solution {
    public int numberOfMatches(int n) {
        int cnt=0, rev=0;
        while(n>1){
            rev=n/2;
            cnt+=rev;
            n=n-rev;
        }
        return cnt;
    }
}
