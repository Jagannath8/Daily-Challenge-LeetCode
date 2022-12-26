class Solution {
    public boolean canJump(int[] nums) {
        int point=0;
        for(int i=0;i<nums.length;i++){
            if(i>point)
                return false;
            point=Math.max(point, i+nums[i]);
        }
        return true;
    }
}
