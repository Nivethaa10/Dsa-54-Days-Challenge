class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int nLen = nums.length;
        int shortest = nLen + 1;
        long[] prefixSum = new long[nLen + 1];
        for(int i=0; i < nLen; i++)
            prefixSum[i+1] = prefixSum[i] + nums[i];
        Deque<Integer> startIdxs = new ArrayDeque<>();
