class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if (p.length() > s.length()) return new ArrayList<>();

        int[] sHash = new int[26];
        int[] pHash = new int[26];

        for (int i = 0; i < p.length(); i++) {
            pHash[p.charAt(i) - 'a']++;
            sHash[s.charAt(i) - 'a']++;
        }

        int left = 0, right = p.length();
        List<Integer> ans = new ArrayList<>();

        while (right < s.length()) {
            if (Arrays.equals(sHash, pHash)) ans.add(left);

            char acquire = s.charAt(right);
            sHash[acquire - 'a']++;

            char discard = s.charAt(left);
            sHash[discard - 'a']--;

            left++; 
            right++;
        }

        if (Arrays.equals(sHash, pHash)) 
            ans.add(left);

        return ans;
    }
}
