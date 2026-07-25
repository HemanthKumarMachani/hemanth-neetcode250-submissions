class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        int count = 0, maxCount = 0;
        for (int index = 0; index < nums.length; index++) {
            if (nums[index] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        maxCount = Math.max(maxCount, count);
        return maxCount;
    }
}