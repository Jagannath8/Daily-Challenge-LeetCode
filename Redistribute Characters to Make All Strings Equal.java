class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)
            return true;
        int total=0;
        for(String s: words){
            total+=s.length();
        }
        if(total%words.length!=0)
            return false;

        int map[]=new int[26];
        for(String s: words){
            for(char c: s.toCharArray()){
                map[c-'a']++;
            }
        }

        for(int m: map){
            if(m%words.length!=0)
                return false;
        }
        return true;
    }
}
