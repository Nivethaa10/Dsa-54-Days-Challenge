class Solution {
    private int n;
    private boolean[][] palindrome;
    private int[] dp;
    private int solve(String s, int i) {
        if (i == n)
            return -1;

        if (dp[i] != -1)
            return dp[i];
