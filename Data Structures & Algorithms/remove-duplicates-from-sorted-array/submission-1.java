class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1)
            return 1;
        int left = 0, right = 0;
        while (right < nums.length) {
            nums[left] = nums[right];
            while (right < nums.length && nums[left] == nums[right]) right++;
            left++;
        }
        return left;
    }
}