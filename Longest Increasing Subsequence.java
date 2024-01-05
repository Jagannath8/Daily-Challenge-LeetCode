class Solution {
    public int lengthOfLIS(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(ans[j]+1>ans[i])
                        ans[i]=ans[j]+1;
                }
            }
        }

        int maxi=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]>ans[maxi])
                maxi=i;
        }

        return ans[maxi]+1;
    }
}
