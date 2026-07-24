class Solution {
    public int minimumDifference(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int leftIdx = 0, rightIdx = k - 1, minDiff = nums[rightIdx] - nums[leftIdx];
        while (rightIdx < nums.length) {
            minDiff = Math.min(minDiff, nums[rightIdx] - nums[leftIdx]);
            leftIdx++;
            rightIdx++;
        }
        return minDiff;
    }
}