class Solution {
    public int maxFrequency(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        //sort the input
        Arrays.sort(nums);
        int maxFreqResult = 0, left = 0, right = 0;
        long totalSum = 0;
        while (right < nums.length) {
            totalSum += nums[right];
            while ((long) nums[right] * (right - left + 1) > totalSum + k) {
                totalSum -= nums[left];
                left++;
            }
            maxFreqResult = Math.max(maxFreqResult, right - left + 1);
            right++;
        }
        return maxFreqResult;
    }
}