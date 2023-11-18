class Solution {
    public int maxFrequency(int[] nums, int k) {
        int maxi=0, curr=0, i=0, j=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            curr+=nums[i];
            while((i-j+1)*nums[i]-curr>k){
                curr-=nums[j];
                j++;
            }
            maxi=Math.max(maxi, i-j+1);
        }
        return maxi;
    }
}
