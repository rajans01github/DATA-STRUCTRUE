class Solution {
    int n, maxValue;
    int MOD = 1_000_000_007; 
    long[][] comb;
    Integer[][] memo;

    public int idealArrays(int n, int maxValue) {
        this.n = n;
        this.maxValue = maxValue;

        // Precompute C(n, k) using Pascal's triangle
        comb = new long[n + 1][15]; // only up to k = 14 needed
        for (int i = 0; i <= n; i++) {
            comb[i][0] = 1;
            for (int j = 1; j <= Math.min(i, 14); j++) {
                comb[i][j] = (comb[i - 1][j - 1] + comb[i - 1][j]) % MOD;
            }
        }

        // Memoization table: memo[val][len] = number of sequences of length `len` starting from `val`
        memo = new Integer[maxValue + 1][15];

        // n= 4, k = 3      {1,2,4}, 1,3,6
        long total = 0;
        for (int start = 1; start <= maxValue; start++) {
            for (int len = 1; len <= 14 && len <= n; len++) {
                int ways = dfs(start, len);
                total = (total + ways * comb[n - 1][len - 1]) % MOD;
            }
        }

        return (int) total;
    }

    // Returns number of sequences of length `len` starting with `val`
    private int dfs(int val, int len) {
        if (len == 1) return 1;
        if (memo[val][len] != null) return memo[val][len];

        long count = 0;
        for (int next = val * 2; next <= maxValue; next += val) {
            count = (count + dfs(next, len - 1)) % MOD;
        }

        return memo[val][len] = (int) count;
    }
}