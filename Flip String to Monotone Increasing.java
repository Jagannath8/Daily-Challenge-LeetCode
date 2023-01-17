class Solution {
    public int minFlipsMonoIncr(String s) {
        int count=0, ans=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='0')
                ans++;
            else
                count++;
            
            if(ans>count)
                ans=count;
        }

        return ans;
    }
}
