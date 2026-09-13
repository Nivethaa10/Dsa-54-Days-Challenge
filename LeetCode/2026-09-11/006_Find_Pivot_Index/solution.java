class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int prefix[]=new int[n+1];
        int suffix[]=new int [n];
        prefix[0]=0;
        suffix[n-1]=nums[n-1];
        for(int i=0;i<n;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }
