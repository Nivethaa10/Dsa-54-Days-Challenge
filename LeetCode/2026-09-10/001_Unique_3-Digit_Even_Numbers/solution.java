class Solution {
    public int totalNumbers(int[] digits) {
        int[] f = new int[10];
        int res = 0;
        for (int d : digits) f[d]++;
        for (int i = 1; i < 10; i++) 
            for (int j = 0; j < 10; j++) 
                for (int k = 0; k < 9; k += 2) {
