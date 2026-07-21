class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums == null || nums.length == 0)
            return nums;
        int left = 0, right = nums.length - 1, resIdx = right;
        int result[] = new int[nums.length];
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[resIdx--] = nums[left] * nums[left];
                left++;
            } else {
                result[resIdx--] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}