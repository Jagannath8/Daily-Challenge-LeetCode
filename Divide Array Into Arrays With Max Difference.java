class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        List<int[]> ans=new ArrayList<>();
        int idx=0;
        for(int i=2;i<nums.length;i+=3){
            if (nums[i]-nums[i-2]>k) 
                return new int[][]{};
            ans.add(new int[]{nums[i-2], nums[i-1], nums[i]});
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
