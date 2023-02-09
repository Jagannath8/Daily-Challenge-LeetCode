class Solution {
    public long distinctNames(String[] ideas) {
        long ans=0;
        HashSet<String> []grp=new HashSet[26];
        for(int i=0;i<26;i++)
            grp[i]=new HashSet<>();

        for(String idea: ideas)
            grp[idea.charAt(0)-'a'].add(idea.substring(1));
        
        for(int i=0;i<25;i++){
            for(int j=i+1;j<26;j++){
                long common=0;
                for(String str: grp[i]){
                    if(grp[j].contains(str))
                        common++;
                }
                ans = ans + 2*(grp[i].size()-common) * (grp[j].size()-common);
            }
        }
        return ans;
    }
}
