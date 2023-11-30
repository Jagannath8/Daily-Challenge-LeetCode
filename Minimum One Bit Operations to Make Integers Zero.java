class Solution {
    public int minimumOneBitOperations(int n) {
        int mul = 1;
        int res = 0;
        while (n > 0) {
            res += n ^ (n - 1) * mul;
            mul = -1 * mul;
            n &= n - 1;
        }
        return Math.abs(res);
    }
}
