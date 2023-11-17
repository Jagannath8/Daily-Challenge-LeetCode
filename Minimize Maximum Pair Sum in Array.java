class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;
        int minMaxPairSum = Integer.MIN_VALUE;
        while (left < right) {
            int curr = nums[left] + nums[right];
            minMaxPairSum = Math.max(minMaxPairSum, curr);
            left++;
            right--;
        }
        return minMaxPairSum;
    }
}
