class Solution {
    public int maxFrequency(int[] nums, int k) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int result = 1;
        for (int currentIdx = 0; currentIdx < nums.length; currentIdx++) {
            int tempK = k;
            int previousIdx = currentIdx - 1;
            while (previousIdx >= 0 && (tempK - (nums[currentIdx] - nums[previousIdx])) >= 0) {
                tempK -= (nums[currentIdx] - nums[previousIdx]);
                previousIdx--;
            }
            result = Math.max(result, currentIdx - previousIdx);
        }
        return result;
    }
}