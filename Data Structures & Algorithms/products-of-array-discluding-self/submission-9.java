class Solution {
    public int[] productExceptSelf(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        int N = nums.length;
        int[] resultProduct = new int[N];
        // build prefix product excluding the current index element
        resultProduct[0] = 1;
        for (int idx = 1; idx < N; idx++) {
            resultProduct[idx] = resultProduct[idx - 1] * nums[idx - 1];
        }
        // Now the we have out prefix array excluding the current index element
        // build suffix product on top of that excluding the curret index element
        // we don't need to store the entire suffix product, we just need to store
        // previous suffix product value to product with the next resultProduct value
        int suffix = 1;
        for (int idx = N - 1; idx >= 0; idx--) {
            resultProduct[idx] *= suffix;
            suffix *= nums[idx];
        }
        return resultProduct;
    }
}
