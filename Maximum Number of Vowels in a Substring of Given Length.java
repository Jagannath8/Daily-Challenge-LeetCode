class Solution {
    public int maxVowels(String s, int k) {
        int count=0, ans=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i)))
                count++;
            if(i>=k && isVowel(s.charAt(i-k)))
                count--;
            ans=Math.max(ans, count);
        }
        return ans;
    }

    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
