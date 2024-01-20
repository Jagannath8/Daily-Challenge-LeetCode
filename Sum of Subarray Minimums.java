class Solution {
    public int sumSubarrayMins(int[] arr) {
        final int MOD = 1000000007;
        Stack<Integer> st = new Stack<>();
        long ans = 0;
        for (int i = 0; i <= arr.length; i++) {
            while (!st.empty() && (i == arr.length || arr[st.peek()] >= arr[i])) {
                int mid = st.pop();
                int left = st.empty() ? -1 : st.peek();
                int right = i;
                long count = (mid - left) * (right - mid) % MOD;
                ans += (count * arr[mid]) % MOD;
                ans %= MOD;
            }
            st.push(i);
        }

        return (int) ans;
    }
}

