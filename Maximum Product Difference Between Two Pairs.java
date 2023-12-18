class Solution {
    public int maxProductDifference(int[] nums) {
        int fb = 0, sb = 0;
        int fs = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n < fs) {
                ss = fs;
                fs = n;
            } 
            else if (n < ss) {
                ss = n;
            }

            if (n > fb) {
                sb = fb;
                fb = n;
            } 
            else if (n > sb) {
                sb = n;
            }
        }
        return fb * sb - fs * ss;        
    }
}
