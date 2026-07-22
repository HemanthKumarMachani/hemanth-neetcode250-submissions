class Solution {
    public int removeDuplicates(int[] nums) {
        // input validation
        if (nums == null || nums.length == 0)
            return 0;
        int left = 0, right = 0, n = nums.length;
        while (right < n) {
            int currentNum = nums[right];
            int count = 0;
            while (right < n && nums[right] == currentNum) {
                right++;
                count++;
            }
            for (int index = 0; index < Math.min(2, count); index++) {
                nums[left++] = currentNum;
            }
        }
        return left;
    }
}