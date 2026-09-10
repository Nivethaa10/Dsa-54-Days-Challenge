class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int zeros = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
