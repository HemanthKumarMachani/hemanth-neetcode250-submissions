class Solution {
    public int removeDuplicates(int[] nums) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        int left = 0;
        for (int num : nums) {
            if (left < 2 || nums[left - 2] != num) {
                nums[left] = num;
                left++;
            }
        }
        return left;
    }
}