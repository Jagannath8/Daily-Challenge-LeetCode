class Solution {
    public int numIdenticalPairs(int[] nums) {
        int ans=0;
        int count[]=new int[101];
        for(int n: nums){
            ans+=count[n]++;
        }
        return ans;
    }
}
