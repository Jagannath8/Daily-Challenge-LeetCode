class Solution {
    public int maxLength(List<String> arr) {
        List<String> ansList = new ArrayList<>();
        int ans = 0;

        ansList.add("");
        for(String str : arr) {
            if(!uniqueCharacterString(str)) {
                continue;
            }
            List<String> currStr = new ArrayList<>();

            for(String candidate : ansList) {
                String temp = candidate+str;
                if(uniqueCharacterString(temp)) {
                    currStr.add(temp);
                    ans = Math.max(ans, temp.length());
                }
            }
            ansList.addAll(currStr);
        }
        return ans;
    }

    private boolean uniqueCharacterString(String str) {
        if(str.length() > 26) return false;
        int[] freq = new int[26];

        for(char ch : str.toCharArray()) {
            freq[ch-'a']++;
            if(freq[ch-'a'] > 1) {
                return false;
            }
        }
        return true;
    }
}
