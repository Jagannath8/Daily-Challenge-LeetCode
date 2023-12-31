class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        Map<Character, Integer> hm=new HashMap<>();
        int maxi=-1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c))
                maxi=Math.max(maxi, i-hm.get(c)-1);
            else
                hm.put(c,i);
        }
        return maxi;
    }
}
