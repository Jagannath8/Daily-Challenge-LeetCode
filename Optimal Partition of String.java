class Solution {
    public int partitionString(String s) {
        int i=0;
        int count=0;
        Map<Character, Boolean> mp=new HashMap<>(); 
        while (i<s.length()) {
            if(mp.containsKey(s.charAt(i))) { 
                count++; 
                mp.clear(); 
            }
            mp.put(s.charAt(i), true);
            i++; 
        }
        return count+1; 
    }
}
