class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans=0;
        int max1=kadane(nums);
        for(int i=0;i<nums.length;i++){
            ans+=nums[i];
            nums[i]=-nums[i];
        }

        int min=kadane(nums);
        int max2=ans+min;

        if(max2==0)
            return max1;

        return Math.max(max1, max2);
    }

    public int kadane(int nums[]){
        int maxSum=nums[0], max=nums[0];
        for(int i=1;i<nums.length;i++){
            maxSum=Math.max(maxSum+nums[i], nums[i]);
            max=Math.max(max, maxSum);
        }
        return max;
    }
}
