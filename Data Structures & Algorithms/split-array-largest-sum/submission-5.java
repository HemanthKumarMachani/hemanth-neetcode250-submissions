class Solution {
    public int splitArray(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        int low = nums[0], high = 0;
        for (int num : nums) {
            low = Math.max(low, num);
            high += num;
        }
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canSplit(nums, mid, k)) {
                result = Math.min(result, mid);
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
    public boolean canSplit(int[] nums, int peak, int k) {
        int split = 1, sum = 0;
        for (int num : nums) {
            if (sum + num > peak) {
                split++;
                sum = 0;
                if (split > k)
                    return false;
            }
            sum += num;
        }
        return true;
    }
}