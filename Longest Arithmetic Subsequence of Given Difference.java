class Solution {
    public int longestSubsequence(int[] arr, int difference) {
        Map<Integer, Integer> mp=new HashMap<>();
        int max=0;
        for(int i: arr){
            mp.put(i, mp.getOrDefault(i-difference, 0)+1);
            max=Math.max(mp.get(i), max);
        }
        return max;
    }
}
