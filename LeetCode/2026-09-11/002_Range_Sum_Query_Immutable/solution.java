class NumArray {

    int[] preSum;
    public NumArray(int[] nums) {
        preSum = nums;
        for (int i = 1; i < preSum.length; ++i)
            preSum[i] += preSum[i-1];
