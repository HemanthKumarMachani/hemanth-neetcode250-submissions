class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int left = 0;
        int minDiff = nums[k - 1] - nums[0];
        // int minDiff = Integer.MAX_VALUE;
        for (int right = k; right < nums.length; right++) {
            left++;
            minDiff = Math.min(minDiff, nums[right] - nums[left]);
        }
        return minDiff;
    }
}