class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        int res = 0;
        for (int d : digits) f[d]++;
