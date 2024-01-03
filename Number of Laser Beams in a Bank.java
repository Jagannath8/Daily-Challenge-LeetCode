class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0, ans=0;
        for(String b:bank){
            int cnt=0;
            for(char c: b.toCharArray()){
                if(c=='1')
                    cnt++;
            }

            if(cnt!=0){
                ans+=(prev*cnt);
                prev=cnt;
            }
        }
        return ans;
    }
}
