class Solution {
    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[left++] = num;
            }
        }
        for (int index = left; index < nums.length; index++) {
            nums[index] = 0;
        }
    }
}