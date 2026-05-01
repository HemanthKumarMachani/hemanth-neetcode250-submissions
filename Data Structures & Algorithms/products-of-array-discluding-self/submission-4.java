class Solution {
    public int[] productExceptSelf(int[] nums) {
        //make sure input is valid
        while (nums == null || nums.length == 0)
            return nums;
        int n = nums.length;
        int[] resultSum = new int[n];
        int[] suffixSum = new int[n];
        int[] productResult = new int[n];
        if (n > 0) {
            resultSum[0] = 1;
        }
        //build prefixsum array {1,2,4,6} -> {1,2,8,48}
        for (int index = 1; index < n; index++) {
            resultSum[index] = nums[index - 1] * resultSum[index - 1];
        }
        //build suffix sum array {1,2,4,6} -> {}
        int suffix = 1;
        for (int index = n - 1; index >= 0; index--) {
            resultSum[index] *= suffix;
            suffix *= nums[index];
        }
        return resultSum;
    }
}