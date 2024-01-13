class Solution {
    public int minSteps(String s, String t) {
        int countS[]=new int[26];
        int countT[]=new int[26];
        for(char ch: s.toCharArray()){
            countS[ch-'a']++;
        }
        for(char ch: t.toCharArray()){
            countT[ch-'a']++;
        }
        int ans=0;
        for(int i=0;i<26;i++){
            ans+=Math.abs(countS[i]-countT[i]);
        }
        return ans/2;
    }
}
