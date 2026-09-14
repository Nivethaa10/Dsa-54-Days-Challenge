class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int len = n / 2; len >= 1; len--) {
            if (n % len == 0) {
