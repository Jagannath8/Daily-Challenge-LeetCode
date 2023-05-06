class Solution {
    public int numSubseq(int[] nums, int target) {
        int ans=0, mod=1000000007, left=0, right=nums.length-1;
        List<Integer> pre=new ArrayList<>();
        pre.add(1);
        for(int i=1;i<=nums.length;i++){
            pre.add((pre.get(i-1)<<1)%mod);
        }

        Arrays.sort(nums);
        while(left<=right){
            if(nums[left]+nums[right]>target)
                right--;
            else
                ans=(ans+pre.get(right-left++))%mod;
        }
        return ans;
    }
}
