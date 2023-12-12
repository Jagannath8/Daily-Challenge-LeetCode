class Solution {
    public int maxProduct(int[] nums) {
        int ans=0, curr=nums[0];
        for(int i=1;i<nums.length;i++){
            ans=Math.max(ans, (curr-1)*(nums[i]-1));
            curr=Math.max(curr, nums[i]);
        }
        return ans;
    }
}
