class Solution {
    HashSet<String> set;
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans=new ArrayList<>();
        if(words.length==0)
            return ans;
        
        set=new HashSet<>();
        for(String w: words){
            set.add(w);
        }

        for(String w: words){
            if(isConcat(w))
                ans.add(w);
        }
        return ans;
    }

    public boolean isConcat(String word){
        int n=word.length();
        for(int i=1;i<n;i++){
            String suffix=word.substring(i);
            if(set.contains(word.substring(0,i)) && (set.contains(suffix) || isConcat(suffix)))
            return true;
        }
        return false;
    }
}
