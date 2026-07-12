class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int left = 0, right = k - 1;
        int minDiff = nums[right] - nums[left];
        while (right < nums.length) {
            minDiff = Math.min(minDiff, nums[right] - nums[left]);
            left++;
            right++;
        }
        return minDiff;
    }
}