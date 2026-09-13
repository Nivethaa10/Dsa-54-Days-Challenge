class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n+1];
        int suffix[]=new int [n];
