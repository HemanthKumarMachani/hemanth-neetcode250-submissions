class Solution {
    public int[] productExceptSelf(int[] nums) {
        // input validaiton
        if (nums == null || nums.length == 0)
            return nums;
        // prefix product array
        int n = nums.length;
        int[] prefixProduct = new int[n];
        int[] suffixProduct = new int[n];
        int[] resultProduct = new int[n];
        prefixProduct[0] = 1;
        suffixProduct[n - 1] = 1;
        for (int idx = 1; idx < n; idx++) {
            prefixProduct[idx] = nums[idx - 1] * prefixProduct[idx - 1];
        }
        for (int idx = n - 2; idx >= 0; idx--) {
            suffixProduct[idx] = suffixProduct[idx + 1] * nums[idx + 1];
        }

        for (int productIdx = 0; productIdx < n; productIdx++) {
            resultProduct[productIdx] = prefixProduct[productIdx] * suffixProduct[productIdx];
        }
        return resultProduct;
    }
}
