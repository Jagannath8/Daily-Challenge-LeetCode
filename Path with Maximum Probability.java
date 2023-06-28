class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start, int end) {
        double dp[] = new double[n];
        dp[start] = 1.0;
        boolean changes = true;
        while (changes) {
            changes = false;
            for (int edgeIdx = edges.length - 1; edgeIdx >= 0; edgeIdx--) {
                int u = edges[edgeIdx][0];
                int v = edges[edgeIdx][1];
                double prob = succProb[edgeIdx];
                if (dp[v] * prob > dp[u]) {
                    dp[u] = dp[v] * prob;
                    changes = true;
                }
                if (dp[u] * prob > dp[v]) {
                    dp[v] = dp[u] * prob;
                    changes = true;
                }
            }
        }
        return dp[end];
    }
}
