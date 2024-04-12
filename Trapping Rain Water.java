class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            if (height[left] <= height[right]) {
                int current = left;
                while (height[++left] < height[current]) {
                    ans += height[current] - height[left];
                } 
            } 
            else {
                int current = right;
                while (height[--right] < height[current]) {
                    ans += height[current] - height[right];
                }
            }
        }
        return ans;
    }
}
