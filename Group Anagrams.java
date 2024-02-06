class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>();        
        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);            
            if (!ans.containsKey(key)) 
                ans.put(key, new ArrayList<>(List.of(word)));
            else 
                ans.get(key).add(word);
        }
        return new ArrayList<>(ans.values());
    }
}
