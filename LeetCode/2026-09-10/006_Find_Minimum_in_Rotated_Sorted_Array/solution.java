class Solution {
    public int findMin(int[] nums) {
        int n = nums.length - 1;
        int last = nums[n];
        int left = 0, right = n;
      
