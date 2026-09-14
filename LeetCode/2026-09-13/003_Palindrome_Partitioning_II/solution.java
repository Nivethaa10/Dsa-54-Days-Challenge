class Solution {
    private int n;
    private boolean[][] palindrome;
    private int[] dp;
    private int solve(String s, int i) {
        if (i == n)
            return -1;

        if (dp[i] != -1)
            return dp[i];
        int cuts = n - 1;

        for (int j = i; j < n; j++)
            if (palindrome[i][j])
                cuts = Math.min(cuts, 1 + solve(s, j + 1));

        return dp[i] = cuts;
    }
